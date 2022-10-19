package br.com.domingosligiane.cadastro_proj.controller

import br.com.domingosligiane.cadastro_proj.controller.request.PostCustomerRequest
import br.com.domingosligiane.cadastro_proj.controller.response.CustomerResponse
import br.com.domingosligiane.cadastro_proj.extension.toCustomerModel
import br.com.domingosligiane.cadastro_proj.extension.toResponse
import br.com.domingosligiane.cadastro_proj.service.CustomerService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("customers")
class CustomerController(
    val customerService: CustomerService
) {

    @GetMapping
    fun getAll(@RequestParam name: String?): List<CustomerResponse>{
        return customerService.getAll(name).map { it.toResponse() }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody @Valid customer: PostCustomerRequest){
        customerService.create(customer.toCustomerModel())

    }

}
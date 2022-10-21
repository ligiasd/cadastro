package br.com.domingosligiane.cadastro_proj.controller

import br.com.domingosligiane.cadastro_proj.controller.request.PostCustomerRequest
import br.com.domingosligiane.cadastro_proj.controller.response.CustomerResponse
import br.com.domingosligiane.cadastro_proj.controller.response.CustomerResponseFilter
import br.com.domingosligiane.cadastro_proj.controller.response.PageResponse
import br.com.domingosligiane.cadastro_proj.extension.toCustomerModel
import br.com.domingosligiane.cadastro_proj.extension.toPageResponse
import br.com.domingosligiane.cadastro_proj.extension.toResponse
import br.com.domingosligiane.cadastro_proj.service.CustomerService
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("customers")
class CustomerController(
    val customerService: CustomerService
) {

    @GetMapping
    fun getAll(@PageableDefault(page = 0, size = 10) pageable: Pageable): PageResponse<CustomerResponse>{
        return customerService.findAll(pageable).map { it.toResponse() }.toPageResponse()
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody @Valid customer: PostCustomerRequest){
        customerService.create(customer.toCustomerModel())

    }

    @GetMapping("/{id}")
    fun getCustomer(@PathVariable id: Int): CustomerResponse {
        return customerService.findById(id).toResponse()
    }

    @GetMapping("/search")
    fun searchCustomer(
        @RequestParam(value = "term", required = false) term: String?,
        @RequestParam(value = "page", required = false) page: Int,
        @RequestParam(value = "size", required = false) size: Int,
        @RequestParam(value = "sort", required = false) sort: String,
        @RequestParam(value = "direction", required = false) direction: String
        ): Page<CustomerResponseFilter> = customerService.searchCustomer(term, PageRequest.of(page,size, Sort.by(Sort.Direction.valueOf(direction))))







}
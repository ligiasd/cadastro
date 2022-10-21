package br.com.domingosligiane.cadastro_proj.service

import br.com.domingosligiane.cadastro_proj.controller.response.CustomerResponseFilter
import br.com.domingosligiane.cadastro_proj.model.CustomerModel
import br.com.domingosligiane.cadastro_proj.repository.CustomerRepository
import br.com.domingosligiane.cadastro_proj.exception.NotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service


@Service
class CustomerService(
    val customerRepository: CustomerRepository,

    ) {
    val customers = mutableListOf<CustomerModel>()

    fun getAll(pageable: Pageable): Page<CustomerModel>{
            return customerRepository.findAll(pageable)

    }

    fun create(customer: CustomerModel){
        customerRepository.save(customer)
    }

    fun findById(id: Int): CustomerModel {
        return customerRepository.findById(id).orElseThrow{ NotFoundException("Customer [${id}] not exists", "ML-0002") }
    }

    fun findAll(pageable: Pageable): Page<CustomerModel> {
        return customerRepository.findAll(pageable)
    }


    fun emailAvailable(email: String?): Boolean {
        return !customerRepository.existsByEmail(email)

    }

    fun cpfAvailable(cpf: String?): Boolean {
        return !customerRepository.existsByCpf(cpf)

    }

    fun searchCustomer(term: String?, pageable: Pageable): Page<CustomerResponseFilter> {
        val page = if (term == null){
            customerRepository.findAll(pageable)
        } else {
            customerRepository.findAllByNameContainingIgnoreCase(term,pageable)
        }
        return page.map { CustomerResponseFilter(it)}
    }


}
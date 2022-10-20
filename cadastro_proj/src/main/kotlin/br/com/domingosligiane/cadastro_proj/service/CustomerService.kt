package br.com.domingosligiane.cadastro_proj.service

import br.com.domingosligiane.cadastro_proj.model.CustomerModel
import br.com.domingosligiane.cadastro_proj.repository.CustomerRepository
import br.com.domingosligiane.cadastro_proj.exception.NotFoundException
import br.com.domingosligiane.cadastro_proj.enums.Errors
import org.springframework.stereotype.Service


@Service
class CustomerService(
    val customerRepository: CustomerRepository,

    ) {
    val customers = mutableListOf<CustomerModel>()

    fun getAll(name: String?): List<CustomerModel>{
        try {
            name?.let {
                return customerRepository.findByNameContaining(name)
            }
            return customerRepository.findAll().toMutableList()
        }
        catch (e: Exception)
        {
            throw e
        }

    }

    fun create(customer: CustomerModel){
        customerRepository.save(customer)
    }

    fun findById(id: Int): CustomerModel{
        return customerRepository.findById(id).orElseThrow{ NotFoundException( Errors.ML201.message.format(id), Errors.ML201.code)}

    }

    fun emailAvailable(email: String?): Boolean {
        return !customerRepository.existsByEmail(email)

    }

    fun cpfAvailable(cpf: String?): Boolean {
        return !customerRepository.existsByCpf(cpf)

    }


}
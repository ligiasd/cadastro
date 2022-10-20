package br.com.domingosligiane.cadastro_proj.repository

import br.com.domingosligiane.cadastro_proj.model.CustomerModel
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.CrudRepository

interface CustomerRepository: CrudRepository<CustomerModel, Int> {

    fun existsByEmail(email: String?): Boolean
    fun existsByCpf(cpf: String?): Boolean
    fun findAll(pageable: Pageable): Page<CustomerModel>

}
package br.com.domingosligiane.cadastro_proj.controller.request

import br.com.domingosligiane.cadastro_proj.validation.CpfAvailable
import br.com.domingosligiane.cadastro_proj.validation.EmailAvailable
import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class PostCustomerRequest (

    @field:NotEmpty(message = "Nome deve ser informado.")
    var name: String,

    @field:Email(message = "E-mail deve ser válido.")
    @field:NotEmpty(message = "E-mail deve ser informado.")
    @EmailAvailable
    var email: String,

    @field:NotEmpty(message = "CPF deve ser informado")
    @CpfAvailable
    var cpf: String


)
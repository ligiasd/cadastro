package br.com.domingosligiane.cadastro_proj.controller.response

import br.com.domingosligiane.cadastro_proj.model.CustomerModel

class CustomerResponse(

    var id: Int? = null,

    var name: String,

    var email: String,

    var cpf: String

)

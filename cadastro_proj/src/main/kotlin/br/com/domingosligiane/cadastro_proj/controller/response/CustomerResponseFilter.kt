package br.com.domingosligiane.cadastro_proj.controller.response

import br.com.domingosligiane.cadastro_proj.model.CustomerModel

class CustomerResponseFilter(

    var id: Int? = null,

    var name: String,

    var email: String,

    var cpf: String

) {
    constructor(customerModel: CustomerModel) : this(
        id = customerModel.id,
        name = customerModel.name,
        email = customerModel.email,
        cpf = customerModel.cpf
    )
}

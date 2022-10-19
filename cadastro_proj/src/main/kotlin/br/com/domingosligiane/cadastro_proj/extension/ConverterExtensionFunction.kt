package br.com.domingosligiane.cadastro_proj.extension

import br.com.domingosligiane.cadastro_proj.controller.request.PostCustomerRequest
import br.com.domingosligiane.cadastro_proj.controller.response.CustomerResponse
import br.com.domingosligiane.cadastro_proj.model.CustomerModel

fun PostCustomerRequest.toCustomerModel(): CustomerModel{
    return CustomerModel(
        name = this.name,
        email = this.email,
        cpf = this.cpf)
}

fun CustomerModel.toResponse(): CustomerResponse {
    return CustomerResponse(
        id = this.id,
        name = this.name,
        email = this.email,
        cpf = this.cpf
    )

}


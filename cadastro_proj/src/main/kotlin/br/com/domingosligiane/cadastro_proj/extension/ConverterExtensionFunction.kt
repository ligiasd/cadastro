package br.com.domingosligiane.cadastro_proj.extension

import br.com.domingosligiane.cadastro_proj.controller.request.PostCustomerRequest
import br.com.domingosligiane.cadastro_proj.controller.response.CustomerResponse
import br.com.domingosligiane.cadastro_proj.controller.response.PageResponse
import br.com.domingosligiane.cadastro_proj.model.CustomerModel
import org.springframework.data.domain.Page

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

fun <T> Page<T>.toPageResponse(): PageResponse<T> {
    return PageResponse(
        this.content,
        this.number,
        this.totalElements,
        this.totalPages
    )
}



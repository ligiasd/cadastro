package br.com.domingosligiane.cadastro_proj.helper

import br.com.domingosligiane.cadastro_proj.model.CustomerModel
import java.util.*

fun buildCustomer(
    id: Int? = null,
    name: String = "customer name",
    email: String = "${UUID.randomUUID()}@email.com",
    cpf: String = "12345634512"
) = CustomerModel(
    id = id,
    name = name,
    email = email,
    cpf = cpf
)

fun buildCustomer2(
    id: Int? = null,
    name: String = "customer name",
    email: String = "${UUID.randomUUID()}@email.com",
    cpf: String = "12345634513"
) = CustomerModel(
    id = id,
    name = name,
    email = email,
    cpf = cpf
)
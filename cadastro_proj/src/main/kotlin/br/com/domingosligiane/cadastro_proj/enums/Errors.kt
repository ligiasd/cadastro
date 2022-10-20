package br.com.domingosligiane.cadastro_proj.enums

import java.util.function.Supplier

enum class Errors(val code: String, val message: String) {

    ML001("ML-001", "Invalid Request"),
    ML201("ML-201", "Customer %s not exists")

}
package br.com.domingosligiane.cadastro_proj.model

import javax.persistence.*

@Entity(name = "customer")
data class CustomerModel (

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column(name = "name")
    var name: String,

    @Column(name = "email")
    var email: String,

    @Column(name = "cpf")
    var cpf: Int

)
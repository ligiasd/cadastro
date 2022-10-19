package br.com.domingosligiane.cadastro_proj.exception

class NotFoundException(override val message: String, val erroCode: String): Exception()  {
}
package br.com.domingosligiane.cadastro_proj.exception

class BadRequestException(override val message: String, val erroCode: String): Exception()  {
}
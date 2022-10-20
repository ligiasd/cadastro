package br.com.domingosligiane.cadastro_proj.controller.response

class PageResponse<T> (
    var itens: List<T>,
    var currentPages: Int,
    var totalItens: Long,
    var totalPages: Int,


)
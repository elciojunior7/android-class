package com.example.myhelloworld.db

import java.io.Serializable

data class Pais (
    var id: Long,
    var nome: String,
    var slogan: String,
    var descricao: String
 ): Serializable
package br.com.exemplo.infrastructure.model

import java.util.*

data class UserEvent(
    val id: UUID?,
    val login: String,
    val password: String
)
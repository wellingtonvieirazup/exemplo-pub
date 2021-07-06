package br.com.exemplo.entrypoint.model

import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

@Introspected
data class UserRequest (

    @field:Email
    @field:NotBlank
    val login: String,

    @field:NotBlank
    @field:Size(min=6)
    val password: String
)

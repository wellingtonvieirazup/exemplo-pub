package br.com.exemplo.entrypoint.controller

import br.com.exemplo.core.mapper.UserConverter
import br.com.exemplo.core.model.User
import br.com.exemplo.core.ports.ServiceUserPort
import br.com.exemplo.entrypoint.model.UserRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.MediaType.APPLICATION_JSON
import io.micronaut.http.annotation.*
import io.micronaut.validation.Validated
import javax.validation.Valid

@Validated
@Controller
class UserController(private val service: ServiceUserPort) {

    @Post("/usuario")
    fun post(@Body @Valid request: UserRequest): UserRequest {

        val user = UserConverter.userRequestToUser(request)

        println(user.login)
        println(user.password)

        return service.createUser(user) //HttpResponse.created(HttpStatus.CREATED)
    }
}
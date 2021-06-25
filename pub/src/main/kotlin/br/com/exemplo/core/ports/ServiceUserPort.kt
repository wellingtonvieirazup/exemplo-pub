package br.com.exemplo.core.ports

import br.com.exemplo.core.model.User
import br.com.exemplo.entrypoint.model.UserRequest
import javax.inject.Singleton

@Singleton
interface ServiceUserPort {
    fun createUser(user: User): UserRequest
}

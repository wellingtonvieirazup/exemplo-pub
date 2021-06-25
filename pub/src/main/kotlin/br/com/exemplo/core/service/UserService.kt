package br.com.exemplo.core.service

import br.com.exemplo.core.mapper.UserConverter
import br.com.exemplo.core.model.User
import br.com.exemplo.core.ports.NatsServicePort
import br.com.exemplo.core.ports.ServiceUserPort
import javax.inject.Singleton

@Singleton
class UserService(private val service: NatsServicePort): ServiceUserPort {
    override fun createUser(user: User) =
        UserConverter.userToUserRequest(service.sendNats(UserConverter.userToUserEvent(user)))
}
package br.com.exemplo.core.mapper

import br.com.exemplo.core.model.User
import br.com.exemplo.entrypoint.model.UserRequest
import br.com.exemplo.infrastructure.model.UserEvent
import java.util.*

class UserConverter {
    companion object {
            fun userRequestToUser(userRequest: UserRequest) =
                User(UUID.randomUUID(),userRequest.login, userRequest.password)

            fun userEventToUser(userEvent: UserEvent) =
                User(userEvent.id,userEvent.login, userEvent.password)

            fun userToUserRequest(user: User) = UserRequest(user.login, user.password)

            fun userToUserEvent(user: User) = UserEvent(user.id, user.login, user.password)

    }
}

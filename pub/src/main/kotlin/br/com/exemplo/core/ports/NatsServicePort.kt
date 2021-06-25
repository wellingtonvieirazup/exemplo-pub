package br.com.exemplo.core.ports

import br.com.exemplo.core.model.User
import br.com.exemplo.infrastructure.model.UserEvent
import javax.inject.Singleton

@Singleton
interface NatsServicePort {
    fun sendNats(userEvent: UserEvent): User
}

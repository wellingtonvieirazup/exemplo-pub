package br.com.exemplo.infrastructure.service

import br.com.exemplo.core.mapper.UserConverter
import br.com.exemplo.core.model.User
import br.com.exemplo.core.ports.NatsServicePort
import br.com.exemplo.infrastructure.client.UserClient
import br.com.exemplo.infrastructure.model.Events
import br.com.exemplo.infrastructure.model.EventsInformationDto
import br.com.exemplo.infrastructure.model.UserEvent
import javax.inject.Singleton

@Singleton
class NatsService(private val client: UserClient): NatsServicePort {

    override fun sendNats(userEvent: UserEvent): User {

        val eventsInformationDto = EventsInformationDto(
            Events.SAVE_USER,
            UserEvent(userEvent.id, userEvent.login, userEvent.password)
        )

        client.send(eventsInformationDto)

        return UserConverter.userEventToUser(userEvent)
    }
}
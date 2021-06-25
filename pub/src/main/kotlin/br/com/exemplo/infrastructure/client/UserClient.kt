package br.com.exemplo.infrastructure.client

import br.com.exemplo.core.model.User
import br.com.exemplo.infrastructure.model.EventsInformationDto
import io.micronaut.nats.annotation.NatsClient
import io.micronaut.nats.annotation.Subject
import javax.inject.Singleton

@NatsClient
@Singleton
interface UserClient {

    @Subject("my-user")
    fun send(eventsInformationDto: EventsInformationDto)

}

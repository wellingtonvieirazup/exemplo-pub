package br.com.exemplo.infrastructure.model

data class EventsInformationDto(
    val events: Events = Events.SAVE_USER,
    val userEvents: UserEvent = UserEvent(null, "", "")
)
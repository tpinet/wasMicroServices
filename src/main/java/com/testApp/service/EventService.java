package com.testApp.service;

import java.util.Optional;

import com.testApp.api.Event;

public interface EventService {
	public void saveEvent(Event event);
	public Iterable<Event> findAllEvents();
	public Optional<Event> findEventById(int id);
}

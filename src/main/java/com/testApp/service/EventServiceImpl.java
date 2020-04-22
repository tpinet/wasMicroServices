package com.testApp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testApp.domain.Event;
import com.testApp.repository.EventRepository;

@Service
public class EventServiceImpl implements EventService {
	
	@Autowired
	private EventRepository repo;


	public void saveEvent(Event event) {
		repo.save(event);
	}


	public Iterable<Event> findAllEvents() {
		return repo.findAll();
	}


	public Optional<Event> findEventById(int id) {
		return repo.findById(id);
	}

}

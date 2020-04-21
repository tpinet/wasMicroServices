package com.testApp.api;

import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventResource {

	@GetMapping("/get-test-event")
	public Event getTestEvent() {
		return new Event(0, "Wine Tasting", new Date(), "For wine tasters and chuggers alike, come sample our best swill", 
				"My front porch", 50);
	}
	
	@GetMapping("/get-all-events")
	public List<Event> getAllEvents() {
		//TODO
		return null;
	}
	
}

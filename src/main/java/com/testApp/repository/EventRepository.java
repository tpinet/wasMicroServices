package com.testApp.repository;

import org.springframework.data.repository.CrudRepository;

import com.testApp.api.Event;

public interface EventRepository extends CrudRepository<Event, Integer> {

}

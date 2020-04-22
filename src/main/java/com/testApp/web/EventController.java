package com.testApp.web;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.testApp.domain.Event;
import com.testApp.service.EventService;


@Controller
public class EventController {
	@Autowired
	private EventService eventService;

	@GetMapping("/index.html")
	public String getIndex() {
		System.out.println("getIndex was called");
		return "/index";
	}
	
	@GetMapping("/") 
	public String getRoot() {
		return "redirect:/index.html";
	}
	
	@ModelAttribute("date")
	public Date getDate() {
		return new Date();
	}
	
	@GetMapping("/addEditEvent") 
	public String showAddForm() {
		return "/addEditEvent";
	}
	
	@RequestMapping("/browse")
	public ModelAndView browsePurchases() {
		Iterable<Event> list =
			eventService.findAllEvents();
		return new ModelAndView("browseEvents",
			 "eventList", list);
	}
}

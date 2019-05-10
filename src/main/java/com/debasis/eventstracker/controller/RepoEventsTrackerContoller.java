package com.debasis.eventstracker.controller;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.debasis.eventstarcker.model.Event;

@RestController
@RequestMapping("api")
public class RepoEventsTrackerContoller {

	@RequestMapping(value = "/events", method = RequestMethod.GET)
	public ResponseEntity<List<Event>> events() {
		RestTemplate restTemplate = new RestTemplate();
	    
	    ResponseEntity<List<Event>> events =
	            restTemplate.exchange("https://api.github.com/repos/debcetb06/RepoEventTracker/events",
	                        HttpMethod.GET, null, new ParameterizedTypeReference<List<Event>>() {
	                });
	    List<Event> eventsList = events.getBody();
	    
		return new ResponseEntity<List<Event>>(eventsList, HttpStatus.OK);
	}
}

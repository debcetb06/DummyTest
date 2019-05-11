package com.debasis.eventstracker.service;

import java.util.List;

import com.debasis.eventstarcker.exception.SystemException;
import com.debasis.eventstarcker.model.Event;
import com.debasis.eventstarcker.model.EventCriteria;

/**
 * <p>This interfaces provides the contact for getting event details from Code repositories</p>
 * @author Debasis Panda
 *
 */
public interface RepoEventsService {

	public List<Event> getRepoEvents(EventCriteria eventCriteria)throws SystemException;
	
	public List<String> getRepoEventTypes() throws SystemException;
}

package com.debasis.eventstracker.dao;

import java.util.List;

import com.debasis.eventstarcker.exception.ServiceException;


public interface RepoEventsDAO {

	public List<String> getEventTypes() throws ServiceException;
}

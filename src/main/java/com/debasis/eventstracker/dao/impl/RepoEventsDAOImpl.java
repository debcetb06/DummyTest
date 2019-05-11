package com.debasis.eventstracker.dao.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.debasis.eventstarcker.exception.ServiceException;
import com.debasis.eventstracker.constant.Constants;
import com.debasis.eventstracker.dao.RepoEventsDAO;

@Repository
public class RepoEventsDAOImpl implements RepoEventsDAO {

	@Override
	public List<String> getEventTypes() throws ServiceException {
		// TODO Auto-generated method stub
		return Arrays.asList(Constants.EVENT_TYPES);
	}

}

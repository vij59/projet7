package org.application.consumer.impl;

import org.application.consumer.contract.DaoFactory;
import org.application.consumer.contract.UserDAO;

public class DaoFactoryImpl implements DaoFactory {

	private UserDAO userDao;

	public UserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}
	
}

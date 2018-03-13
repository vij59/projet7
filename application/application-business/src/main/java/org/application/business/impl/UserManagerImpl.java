package org.application.business.impl;

import java.util.List;

import org.application.business.contract.UserManager;
import org.application.model.User;

public class UserManagerImpl extends AbstractManager implements UserManager {

	public List<User> getUsers() {

		return getDaoFactory().getUserDao().getUsers();
	}

}

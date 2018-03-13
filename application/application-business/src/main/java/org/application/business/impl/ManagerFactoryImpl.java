package org.application.business.impl;

import org.application.business.contract.ManagerFactory;
import org.application.business.contract.UserManager;

public class ManagerFactoryImpl implements ManagerFactory {

	private UserManager userManager;
	
	public UserManager getUserManager() {
		// TODO Auto-generated method stub
		return userManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	

}

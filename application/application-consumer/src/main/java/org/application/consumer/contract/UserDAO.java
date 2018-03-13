package org.application.consumer.contract;

import java.util.List;

import org.application.model.User;

public interface UserDAO {
	
	public List<User> getUsers();

}

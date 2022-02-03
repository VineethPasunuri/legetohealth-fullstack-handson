package com.legatohealth.service;

import java.util.List;

import com.legatohealth.beans.User;
import com.legatohealth.exceptions.UserNotFoundException;

public interface UserService {
	public User store(User user);

	public User fetchUser(int id) throws UserNotFoundException;

	public void deleteUser(int id) throws UserNotFoundException;

	public User updatePassword(int id, String password) throws UserNotFoundException;

	public List<User> fetchAllUsers();

}

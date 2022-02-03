package com.legatohealth.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.legatohealth.beans.User;
import com.legatohealth.dao.UserDao;
import com.legatohealth.exceptions.UserNotFoundException;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	@Override
	@Transactional
	public User store(User user) {
		User userCreated = dao.save(user);
		return userCreated;
	}

	@Override
	public User fetchUser(int id) throws UserNotFoundException {
		User user = null;
		Optional<User> optional = dao.findById(id);
		if (optional.isPresent()) {
			user = optional.get();
		} else {
			throw new UserNotFoundException("User with ID : " + id + "is not present");
		}
		return user;
	}

	@Override
	@Transactional
	public void deleteUser(int id) throws UserNotFoundException {
		User user = fetchUser(id);
		dao.delete(user);
	}

	@Override
	@Transactional
	public User updatePassword(int id, String password) throws UserNotFoundException {
		User user = fetchUser(id);
		user.setPassword(password);
		return user;
	}

	@Override
	public List<User> fetchAllUsers() {
		List<User> list = dao.findAll();
		return list;
	}

}

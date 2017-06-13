package ua.com.proteus.service;

import java.util.List;

import ua.com.proteus.entity.User;

public interface UserService {
	void save(User user);
	void update(User user);
	List<User> findAll();
	User findOne(int id);
	void delete(String email);
	void delete(int id);
	User findByEmail(String email);
	User findByName(String name);
}

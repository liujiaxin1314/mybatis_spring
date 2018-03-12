package com.jxliu.ms.dao;

import java.util.List;

import com.jxliu.ms.pojo.User;

public interface UserDao {

	User getUserById(int id);
	List<User> getUserByName(String username);
	void insertUser(User user);
}

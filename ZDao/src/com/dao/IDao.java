package com.dao;

import java.util.List;

import co.entity.User;

public interface IDao {

	public void addUser(User u);
	public User findById(int id);
	public List<User> users();
}

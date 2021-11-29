package com.dao.imp;

import java.util.List;

import com.dao.IDao;

import co.entity.User;

public class DaoImplXml implements IDao{

	@Override
	public void addUser(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return new User(2,"xml","passxml");
	}

	@Override
	public List<User> users() {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.dao.imp;

import java.util.ArrayList;
import java.util.List;

import com.dao.IDao;

import co.entity.User;

public class DaoImpl implements IDao{

	static List<User> users=new ArrayList<>();
	@Override
	public void addUser(User u) {
		users.add(u);
		
	}

	@Override
	public User findById(int id) {
		for (User u : users) {
			if(u.getId()==id)
				return u;
			
		}
		return null;
	}

	@Override
	public List<User> users() {
		// TODO Auto-generated method stub
		return users;
	}

}

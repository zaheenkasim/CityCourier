package com.project.serv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.UserDao;
import com.project.model.User;

@Service
public class UserServImple implements UserServ {

	@Autowired
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean login(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean create(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean resetPassword(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}

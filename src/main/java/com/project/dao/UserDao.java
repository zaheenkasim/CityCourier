package com.project.dao;

import com.project.model.User;

public interface UserDao {

	public boolean login(User user);

	public boolean create(User user);

	public boolean resetPassword(User user);
}

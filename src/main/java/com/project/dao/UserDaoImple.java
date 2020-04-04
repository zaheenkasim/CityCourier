package com.project.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.RowMapper;

import com.project.model.User;

@Repository
public class UserDaoImple implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public boolean login(User user) {
		// TODO Auto-generated method stub
		String sql="select * from login where userid=? and password=?";
		System.out.print(sql);
		User u=jdbcTemplate.queryForObject(sql, new Object[] {user.getUserID(),user.getUserPassword()}, new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User p=new User();
				p.setUserID(rs.getString(1));
				p.setUserPassword(rs.getString(2));
				return p;
			}
			
		});
		if(u==null)
		{
			return false;
		}
		
		return true;
	}

		

	public boolean create(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean resetPassword(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}

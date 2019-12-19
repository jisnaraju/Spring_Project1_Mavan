package com.jisna.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.jisna.model.Login;
import com.jisna.model.UserRegister;

public class UserDaoImpl implements UserDao {
   @Autowired
   JdbcTemplate jdbcTemplate;
   public void register(UserRegister user) {
		String sql="insert into users values(?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql,new Object[] {user.getUname(),user.getPassword(),
				user.getFname(),user.getLname(),user.getEmail(),
				user.getAddress(),user.getPhone()});
			}

public UserRegister validateUser(Login login) {
	String sql="select * from users where username='"+login.getUname()+"' and password='"+login.getPassword()+"'";
	System.out.println(sql);
	List<UserRegister> listuser=jdbcTemplate.query(sql,new Mapper());
	System.out.println(listuser);
	return listuser.size()>0?listuser.get(0):null;
}

class Mapper implements RowMapper<UserRegister>
{
public UserRegister mapRow(ResultSet rs,int arg1)	throws SQLException
{
	
	
	UserRegister user=new UserRegister();
	
	user.setUname(rs.getString("username"));
	user.setEmail(rs.getString("email"));
	user.setPassword(rs.getString("password"));
	return user;
}}

}

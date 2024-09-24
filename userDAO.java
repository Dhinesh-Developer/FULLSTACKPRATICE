package com.dk.user.DAO;

import java.util.List;

import com.dk.model.user.user;

public interface userDAO {
	int insertUser(user user);
	List<user> getAllUsers();
	user getUserById (int id);
	int deleteUserById(int id);
	int updateUserById(int id,String address);
	
}

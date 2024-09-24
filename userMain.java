package com.dk.mainMethods;

import java.util.ArrayList;

import com.dk.DAO.Impl.userDAOImpl;
import com.dk.model.user.user;
import com.dk.user.DAO.userDAO;

public class userMain {

	public static void main(String[] args) {
	

	
	userDAO udeo = new userDAOImpl();

	//System.out.println(status);
	
	
	 user u = new user(27,"Akhil","123","akhil@gmail.com","VBM","698761324","Customer");
	 int status = udeo.insertUser(u);
     ArrayList <user> users = (ArrayList<user>) udeo .getAllUsers();
	for(user u1 : users)
	{
		System.out.println(u1);
	}
	
	
	user user = udeo.getUserById(25);
	System.out.println(user);
	
	status = udeo.deleteUserById(1);
	System.out.println(status);
	 
	
	 status = udeo.updateUserById(2, "Yelhanka, Bangolore");
	 System.out.println(status);
	
	
	
	
	}

}

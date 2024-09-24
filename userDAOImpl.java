package com.dk.DAO.Impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.dk.model.user.user;
import com.dk.user.DAO.userDAO;

public class userDAOImpl implements userDAO{
	
	static Connection con;
	ArrayList<user> userList = new ArrayList<user>();
	private static final String insert_user = "insert into user (userid,username,password,email,address,phone,role) values(?,?,?,?,?,?,?)";
	private static final String get_All = "select * from user";
	private static final String get_User_Id= "select * from user where userid = ?";
	private static final String delete_by_User_Id = "delete from user where userid = ?";
	private static final String update_Address_By_Id = "update user set address = ? where userid = ?";
	
	private PreparedStatement pstmt;
	private Statement st;
	private ResultSet res;
	private user user;
	static
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/app", "root", "root@dk");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public int insertUser(user user) {
		int x = -1;
		try {
			pstmt = con.prepareStatement(insert_user);
			pstmt.setInt(1, user.getUserid());
			pstmt.setString(2, user.getUsername());
			pstmt.setString(3, user.getPassword());
			pstmt.setString(4, user.getEmail());
			pstmt.setString(5, user.getAddress());
			pstmt.setString(6, user.getPhone());
			pstmt.setString(7, user.getRole());
			x  =pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<user> getAllUsers() {
		try {
			st = con.createStatement();
			res = st.executeQuery(get_All);
			userList = (ArrayList<user>) extractUserFromResultSet(res);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return userList;
	}

	@Override
	public user getUserById(int id) {
		try {
			pstmt = con.prepareStatement(get_User_Id);
			pstmt.setInt(1, id);
			res = pstmt.executeQuery();
			
			userList = (ArrayList<user>) extractUserFromResultSet(res);
			user = userList.get(0);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public int deleteUserById(int id) {
		int x=-1;
		try {
			pstmt = con.prepareStatement(delete_by_User_Id);
			pstmt.setInt(1, id);
	        x = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return x;
	}

	@Override
	public int updateUserById(int id, String address) {
		int x=-1;
		try {
			pstmt = con.prepareStatement(update_Address_By_Id);
			pstmt.setString(1, address);
			pstmt.setInt(2, id);
			x = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	 List<user> extractUserFromResultSet(ResultSet res)
	{
		try {
			while(res.next())
			{
				
					userList.add(new user(res.getInt(1),res.getString(2),res.getString(3),res.getString(4)
							,res.getString(5),res.getString(6),res.getString(7)));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return userList;
	}

}

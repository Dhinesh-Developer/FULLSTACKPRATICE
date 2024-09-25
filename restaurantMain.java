package com.dk.mainMethods;

import com.dk.DAO.Impl.restaurantDAoImpl;
import com.dk.model.user.restaurant;
import com.dk.restaurant.DAO.restaurantDAO;

public class restaurantMain {

	public static void main(String[] args) {
		
		restaurantDAO rdo = new restaurantDAoImpl();
	
		/*
		 * 
		 * 	restaurant r = new restaurant("RR","SALEM","12256117",4.5, 30,"mjahk/jhg");
		int status = rdo.insertRestaurant(r);
			restaurant restaurant = rdo.getRestaurantById(2);
		System.out.println(restaurant);
		 */
		
	
		
		int status = rdo.deleteRestaurantById(1);
		System.out.println(status);
		 
	}

}

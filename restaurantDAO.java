package com.dk.restaurant.DAO;

import java.util.List;

import com.dk.model.user.restaurant;

public interface restaurantDAO {

	int insertRestaurant(restaurant restaurant);
	List<restaurant > getAllrestaurant();
	restaurant getRestaurantById(int id);
	int deleteRestaurantById(int id);
	int updateRestaurantById(int id);

}


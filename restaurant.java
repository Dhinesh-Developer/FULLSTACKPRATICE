package com.dk.model.user;

public class restaurant {

	private int restaurantId;
	private String restaurantName;
	private String  address;
	private String phone;
	private double rating;

	private int eta;
	private String imagepath;
	public restaurant(int restaurantId, String restaurantName, String address, String phone, double rating,
			int eta, String imagepath) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.address = address;
		this.phone = phone;
		this.rating = rating;
		this.eta = eta;
		this.imagepath = imagepath;
	}
	
	
 @Override
	public String toString() {
		return "restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", address="
				+ address + ", phone=" + phone + ", rating=" + rating + ", eta=" + eta
				+ ", imagepath=" + imagepath + "]";
	}


public int getRestaurantId() {
		return restaurantId;
	}


	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}


	public String getRestaurantName() {
		return restaurantName;
	}


	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}




	public restaurant(String restaurantName, String address, String phone, double rating, int eta, String imagepath) {
		super();
		this.restaurantName = restaurantName;
		this.address = address;
		this.phone = phone;
		this.rating = rating;
		this.eta = eta;
		this.imagepath = imagepath;
	}


	public int getEta() {
		return eta;
	}


	public void setEta(int eta) {
		this.eta = eta;
	}


	public String getImagepath() {
		return imagepath;
	}


	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}


public restaurant() {
	// TODO Auto-generated constructor stub
}


}


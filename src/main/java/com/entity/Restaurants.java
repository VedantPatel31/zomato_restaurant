package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter
@Setter
@Entity
@Table(name = "restaurants")
public class Restaurants {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer restaurantId;
	String name;
	String category;
	String address;
	String contactNum;
	Integer rating;
	String lat;
	String log;
	String email;
	String pincode;
	String password;
	Boolean orderAccepting;
	String description;
	String restaurantImagePath;
	
}

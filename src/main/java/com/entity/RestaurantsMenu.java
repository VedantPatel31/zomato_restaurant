package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "restaurantsMenu")
public class RestaurantsMenu {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer menuId;
	Integer restaurantId;
	String title;
	Boolean active;
	String offerTitle;
	Integer percentage;
	Integer upto;
	Integer flat_discount;
	Boolean isBogo;
	Integer perQty;
	Integer perFreeQty;
}

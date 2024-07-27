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
@Table(name = "RestaurantsMenuItems")
public class RestaurantsMenuItems {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer itemId;
	Integer menuId;
	Integer restaurantId;
	String title;
	Integer amount;
	String description;
	Boolean active;
	String offer;
	Integer percentage;
	Integer upto;
	Integer flat_discount;
	Boolean isBogo;
	Integer perQty;
	Integer perFreeQty;
	String itemImagePath;
	Boolean isVeg;
	Boolean egg;
	Integer qty ;
}

package com.mibeargui.cardapio.dto;

import org.springframework.beans.BeanUtils;

import com.mibeargui.cardapio.food.Food;

public class FoodResponseDTO {

	private Long id;
	private String title;
	private String image;	
	private Integer price;
	
	public FoodResponseDTO() {
	}
	
	public FoodResponseDTO(Food entity) {
		BeanUtils.copyProperties(entity, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
	
}

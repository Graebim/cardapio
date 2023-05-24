package com.mibeargui.cardapio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mibeargui.cardapio.food.Food;

public interface FoodRepository extends JpaRepository<Food, Long>{

}

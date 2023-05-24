package com.mibeargui.cardapio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.mibeargui.cardapio.dto.FoodResponseDTO;
import com.mibeargui.cardapio.food.Food;
import com.mibeargui.cardapio.repositories.FoodRepository;

public class FoodService {

	@Autowired
	private FoodRepository foodRepository;
	
	@Transactional(readOnly = true)
	public List<FoodResponseDTO> findAll(){
		List<Food> result = foodRepository.findAll();
		List<FoodResponseDTO> dto = result.stream().map(x -> new FoodResponseDTO(x)).toList();
		return dto;
	}
}

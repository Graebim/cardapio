package com.mibeargui.cardapio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mibeargui.cardapio.dto.FoodResponseDTO;
import com.mibeargui.cardapio.services.FoodService;

@RestController
@RequestMapping("/food")
public class FoodController {
	
	@Autowired	
	private FoodService foodService;
	
	@GetMapping
	public List<FoodResponseDTO> getAll() {
		List<FoodResponseDTO> result = foodService.findAll();
		return result;
	}
}
	
package com.example.cardapio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cardapio.food.FoodDTO;
import com.example.cardapio.food.FoodRepository;

@RestController
@RequestMapping("food")
public class FoodController {
    
    @Autowired
    private FoodRepository foodRepository;

    @GetMapping
    public List<FoodDTO> getAll() {
        List<FoodDTO> foodList = foodRepository.findAll().stream().map(FoodDTO::new).toList();
        return foodList;
    }
}

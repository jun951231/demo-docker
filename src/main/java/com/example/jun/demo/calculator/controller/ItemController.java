package com.example.jun.demo.calculator.controller;

import com.example.jun.demo.calculator.entity.Item;
import com.example.jun.demo.calculator.service.ItemService;
import com.example.jun.demo.calculator.service.ItemServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/items")
public class ItemController {
    private final ItemServiceImpl itemService;

    @GetMapping("/all")
    public List<Item> findAll(){
        return itemService.findAll();
    }

    @GetMapping("/name/{name}")
    public List<Item> findAllByItemName(@PathVariable String name){
        return itemService.findAllByItemName(name);
    }
    @GetMapping("/id/{id}")
    public Optional<Item> findById(@PathVariable long id){
        return itemService.findById(id);
    }
}

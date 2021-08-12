package com.example.jun.demo.calculator.service;

import com.example.jun.demo.calculator.entity.Item;
import com.example.jun.demo.calculator.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService{
    private final ItemRepository itemRepository;

    @Override
    public List<Item> findAll(){
        return itemRepository.findAll();
    }
    @Override
    public List<Item> findAllByItemName(String itemName){
        return itemRepository.findAllByItemName(itemName);
    }
    @Override
    public Optional<Item> findById(long id){
        return itemRepository.findById(id);
    }
}

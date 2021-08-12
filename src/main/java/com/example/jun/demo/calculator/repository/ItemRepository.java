package com.example.jun.demo.calculator.repository;

import com.example.jun.demo.calculator.entity.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends MongoRepository<Item, Long> {
    List<Item> findAllByItemName(String itemName);
}

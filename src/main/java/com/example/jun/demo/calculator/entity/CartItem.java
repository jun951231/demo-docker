package com.example.jun.demo.calculator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cart_items")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {
    private Item item;
    private int quantity;
}

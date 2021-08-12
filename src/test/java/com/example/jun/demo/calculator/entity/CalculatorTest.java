package com.example.jun.demo.calculator.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class CalculatorTest {
    @Mock Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator(2, 4);
    }

    @Test
    void test_multi(){
        System.out.println(">>> "+calculator.toString());
    }
}
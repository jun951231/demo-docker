package com.example.jun.demo.calculator.service;

import com.example.jun.demo.calculator.entity.Calculator;
import com.example.jun.demo.calculator.repository.CalculatorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CalculatorServiceImpl implements CalculatorService{
    private final CalculatorRepository calculatorRepository;

    @Override
    public int createRandomNumbers() {
        return (int)(Math.random()*100)+1;
    }
}

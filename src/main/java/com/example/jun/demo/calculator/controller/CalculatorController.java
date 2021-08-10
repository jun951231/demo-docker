package com.example.jun.demo.calculator.controller;

import com.example.jun.demo.calculator.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public final class CalculatorController {
    private final CalculatorService calculatorService;
}

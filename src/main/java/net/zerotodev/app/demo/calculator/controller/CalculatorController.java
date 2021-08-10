package net.zerotodev.app.demo.calculator.controller;

import lombok.RequiredArgsConstructor;
import net.zerotodev.app.demo.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequiredArgsConstructor
public final class CalculatorController {
    private final CalculatorService calculatorService;
}

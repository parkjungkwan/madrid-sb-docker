package net.zerotodev.app.demo.calculator.service;

import lombok.RequiredArgsConstructor;
import net.zerotodev.app.demo.calculator.entity.Calculator;
import net.zerotodev.app.demo.calculator.repository.CalculatorRepository;
import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public class CalculatorServiceImpl implements CalculatorService {
    private final CalculatorRepository calculatorRepository;

    @Override
    public int createRandomNumber() {
        return (int)(Math.random()*100)+1;
    }
}

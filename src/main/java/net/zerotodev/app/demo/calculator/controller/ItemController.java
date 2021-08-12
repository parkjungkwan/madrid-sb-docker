package net.zerotodev.app.demo.calculator.controller;

import lombok.RequiredArgsConstructor;
import net.zerotodev.app.demo.calculator.service.ItemService;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;
}

package net.zerotodev.app.demo.calculator.controller;

import lombok.RequiredArgsConstructor;
import net.zerotodev.app.demo.calculator.entity.Item;
import net.zerotodev.app.demo.calculator.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController @RequiredArgsConstructor
@RequestMapping("/items")
public class ItemController {
    private final ItemService itemService;

    @GetMapping("/all")
    public List<Item> findAll() {
        return itemService.findAll();
    }
    @GetMapping("/name/{name}")
    public List<Item> findAllByItemName(@PathVariable String name){
        return itemService.findAllByItemName(name);
    }
    @GetMapping("/id/{id}")
    public Optional<Item> findById(long id){
        return itemService.findById(id);
    }
}

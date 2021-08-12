package net.zerotodev.app.demo.calculator.service;

import lombok.RequiredArgsConstructor;
import net.zerotodev.app.demo.calculator.repository.ItemRepository;
import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public class ItemServiceImpl implements ItemService{
    private final ItemRepository itemRepository;
}

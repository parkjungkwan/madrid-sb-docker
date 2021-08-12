package net.zerotodev.app.demo.calculator.service;

import lombok.RequiredArgsConstructor;
import net.zerotodev.app.demo.calculator.entity.Item;
import net.zerotodev.app.demo.calculator.entity.User;
import net.zerotodev.app.demo.calculator.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service @RequiredArgsConstructor
public class ItemServiceImpl implements ItemService{
    private final ItemRepository itemRepository;
    @Override public List<Item> findAll() {
        return itemRepository.findAll();
    }
    @Override public List<Item> findAllByItemName(String itemName){
        return itemRepository.findAllByItemName(itemName);
    }
    @Override public Optional<Item> findById(long id){
        return itemRepository.findById(id);
    }
}

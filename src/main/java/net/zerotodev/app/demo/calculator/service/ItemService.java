package net.zerotodev.app.demo.calculator.service;

import net.zerotodev.app.demo.calculator.entity.Item;
import net.zerotodev.app.demo.calculator.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component public interface ItemService {
    List<Item> findAll();
    List<Item> findAllByItemName(String itemName);
    Optional<Item> findById(long id);
}

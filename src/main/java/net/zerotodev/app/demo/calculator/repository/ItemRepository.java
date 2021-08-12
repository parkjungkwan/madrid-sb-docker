package net.zerotodev.app.demo.calculator.repository;

import net.zerotodev.app.demo.calculator.entity.Item;
import net.zerotodev.app.demo.calculator.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends MongoRepository<Item, Long> {
    List<Item> findAllByItemName(String itemName);
}

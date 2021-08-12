package net.zerotodev.app.demo.calculator.repository;

import net.zerotodev.app.demo.calculator.entity.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends MongoRepository<Item, Long> {

}

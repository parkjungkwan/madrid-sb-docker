package net.zerotodev.app.demo.calculator.service;

import net.zerotodev.app.demo.calculator.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface UserService {
    List<User> findAll();
    List<User> findAllByName(String name);
    Optional<User> findById(long id);
}

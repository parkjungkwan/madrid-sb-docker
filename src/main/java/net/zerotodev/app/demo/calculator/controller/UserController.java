package net.zerotodev.app.demo.calculator.controller;

import lombok.RequiredArgsConstructor;
import net.zerotodev.app.demo.calculator.entity.User;
import net.zerotodev.app.demo.calculator.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController @RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @GetMapping("/all")
    public List<User> findAll() {
        return userService.findAll();
    }
    @GetMapping("/name/{name}")
    public List<User> findAllByName(String name){
        return userService.findAllByName(name);
    }
    @GetMapping("/id/{id}")
    public Optional<User> findById(long id){
        return userService.findById(id);
    }
}

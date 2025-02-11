package com.rental.rentalMovies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rental.rentalMovies.entities.User;
import com.rental.rentalMovies.service.UserService;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public User saveUser(@jakarta.validation.Valid @RequestBody User entity) {
        return userService.save(entity);
    }

    @GetMapping("/findByEmail/{email}")
    public User findByEmail(@PathVariable String email) {
        return userService.findByEmail(email);
    }

    @DeleteMapping("/delete/{email}")
    public void deleteByEmail(@PathVariable String email) {
        userService.deleteByEmail(email);
    }

    @GetMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    @PutMapping("/update/{email}")
    public User updateUser(@PathVariable String email, @RequestBody User entity) {
        return userService.update(email, entity);
    }

}

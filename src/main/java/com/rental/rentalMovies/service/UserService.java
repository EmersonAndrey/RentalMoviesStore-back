package com.rental.rentalMovies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rental.rentalMovies.entities.User;
import com.rental.rentalMovies.exception.ExistingUserException;
import com.rental.rentalMovies.exception.ResourceNotFoundException;
import com.rental.rentalMovies.repository.UserRespository;

@Service
public class UserService {

    @Autowired
    private UserRespository userRespository;

    public User findByEmail(String email) {
        return userRespository.findByEmail(email)
                .orElseThrow(() -> new ResourceNotFoundException("The user with the email provided doesn't exist"));
    }

    public User save(User user) {
        boolean exist = findAll().stream()
                .anyMatch(userLogged -> userLogged.getEmail().equals(user.getEmail()));

        if (exist) {
            throw new ExistingUserException("There is already a user with this email");
        }
        return userRespository.save(user);
    }

    public void deleteByEmail(String email) {
        userRespository.delete(findByEmail(email));
    }

    public List<User> findAll() {
        return userRespository.findAll();
    }

    public User update(String email, User editedUser) {
        User newUser = findByEmail(email);
        newUser.setName(editedUser.getName());
        newUser.setEmail(editedUser.getEmail());
        newUser.setPassword(editedUser.getPassword());
        newUser.setMovies(editedUser.getMovies());
        return userRespository.save(newUser);
    }

}

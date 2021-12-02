package com.ciclo4.reto2.interfaces;

import com.ciclo4.reto2.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

/**
 * @author Ricardo Parrado Forero
 */

public interface UserInterface extends MongoRepository<User, Integer> {

    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email, String password);


}

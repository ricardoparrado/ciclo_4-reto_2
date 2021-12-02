package com.ciclo4.reto2.interfaces;

import com.ciclo4.reto2.model.Clone;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

/**
 * @author Ricardo Parrado Forero
 */

public interface CloneInterface extends MongoRepository<Clone, Integer> {



}

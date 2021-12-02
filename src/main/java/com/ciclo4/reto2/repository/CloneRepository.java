package com.ciclo4.reto2.repository;

import com.ciclo4.reto2.interfaces.CloneInterface;
import com.ciclo4.reto2.model.Clone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Ricardo Parrado Forero
 */

@Repository
public class CloneRepository {

    @Autowired
    private CloneInterface cloneInterface;

    public List<Clone> getAll() {
        return (List<Clone>) cloneInterface.findAll();
    }

    public Optional<Clone> getClone(Integer id) {
        return cloneInterface.findById(id);
    }

    public Clone save(Clone clone) {
        return cloneInterface.save(clone);
    }

    public void update(Clone clone) {
        cloneInterface.save(clone);
    }

    public void delete(Clone clone) {
        cloneInterface.delete(clone);
    }
}

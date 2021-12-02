package com.ciclo4.reto2.controller;

import com.ciclo4.reto2.model.Clone;
import com.ciclo4.reto2.service.CloneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author Ricardo Parrado Forero
 */

@RestController
@RequestMapping("/api/clone")
@CrossOrigin("*")
public class CloneController {

    @Autowired
    private CloneService cloneService;

    @GetMapping("/all")
    public List<Clone> getAll() {
        return cloneService.getAll();
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Clone create(@RequestBody Clone gadget) {
        return cloneService.save(gadget);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Clone update(@RequestBody Clone gadget) {
        return cloneService.update(gadget);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") Integer id) {
        return cloneService.delete(id);
    }
}

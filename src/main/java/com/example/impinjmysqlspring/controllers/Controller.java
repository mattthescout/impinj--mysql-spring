package com.example.impinjmysqlspring.controllers;

import antlr.collections.impl.IndexedVector;
import com.example.impinjmysqlspring.repository.InventoriedTag;
import com.example.impinjmysqlspring.repository.TagRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(Controller.BASE_URL)
public class Controller {

    public static final String BASE_URL = "/api/v1/tags";

    private final TagRepository tagRepository;

    public Controller(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    @CrossOrigin
    @GetMapping
    List<InventoriedTag> findAllTags () {
       return tagRepository.findAll();
    }

}

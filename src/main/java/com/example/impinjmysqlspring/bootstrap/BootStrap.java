package com.example.impinjmysqlspring.bootstrap;

import com.example.impinjmysqlspring.repository.TagRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements CommandLineRunner {

    private final TagRepository tagRepository;

    public BootStrap(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}

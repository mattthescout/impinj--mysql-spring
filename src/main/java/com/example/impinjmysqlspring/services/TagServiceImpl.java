package com.example.impinjmysqlspring.services;

import com.example.impinjmysqlspring.repository.InventoriedTag;
import com.example.impinjmysqlspring.repository.TagRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {

    private final TagRepository tagRepository;

    public TagServiceImpl(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    @Override
    public List<InventoriedTag> findAllTags() {
        return tagRepository.findAll();
    }
}

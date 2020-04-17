package com.example.impinjmysqlspring.services;

import com.example.impinjmysqlspring.repository.InventoriedTag;

import java.util.List;

public interface TagService {
    List<InventoriedTag> findAllTags();
}

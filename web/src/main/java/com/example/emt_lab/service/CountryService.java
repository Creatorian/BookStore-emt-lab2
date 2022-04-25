package com.example.emt_lab.service;

import antlr.collections.List;
import com.example.emt_lab.model.Country;
import com.google.common.base.Optional;

import java.util.List;
import java.util.Optional;

public interface CountryService {
    List<Country> findAll();
    void deleteById(Long id);
    Optional<Country> findById(Long id);
}

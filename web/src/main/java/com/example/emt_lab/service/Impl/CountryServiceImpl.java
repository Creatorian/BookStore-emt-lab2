package com.example.emt_lab.service.Impl;

import antlr.collections.List;
import com.example.emt_lab.model.Country;
import com.example.emt_lab.repository.CountryRepository;
import com.example.emt_lab.service.CountryService;
import com.google.common.base.Optional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {


    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }


    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }


    @Override
    public void deleteById(Long id) {
        countryRepository.deleteById(id);
    }

    @Override
    public Optional<Country> findById(Long id) {
        Country country = countryRepository.findById(id).orElseThrow(RuntimeException::new);
        return Optional.of(country);
    }
}

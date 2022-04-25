package com.example.emt_lab.web.rest;

import antlr.collections.List;
import com.example.emt_lab.model.Country;
import com.example.emt_lab.service.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/country")
public class CountryController {
    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }
    @GetMapping
    public List<Country> findAll() {
        return this.countryService.findAll();
    }
}

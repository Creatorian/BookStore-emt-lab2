package com.example.emt_lab.repository;

import antlr.collections.List;
import com.example.emt_lab.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CountryRepository extends JpaRepository<Country,Long> {

    List<Country> findAllByName(String text);
    void deleteByName(String name);

}

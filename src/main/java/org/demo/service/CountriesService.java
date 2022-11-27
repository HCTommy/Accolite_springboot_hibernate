package org.demo.service;

import org.demo.model.CountryModel;
import org.demo.repository.CountriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CountriesService {
    @Autowired
    private CountriesRepository countriesRepository;

    public List<CountryModel> findAllCountries(){
        List<CountryModel> all = countriesRepository.findAll();
        return all;
    }

    public Optional<CountryModel> findCountryById(Integer id){
        return countriesRepository.findById(id);
    }


}

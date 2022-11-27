package org.demo.controller;

import org.apache.tomcat.util.json.JSONParser;
import org.demo.model.CountryModel;
import org.demo.service.CountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CountriesController {

    @Autowired
    private CountriesService countriesService;

    @GetMapping("/getAllCountries")
    public String printAllCountries(){
        List<CountryModel> allCountries = countriesService.findAllCountries();
        System.out.println(allCountries);

        return allCountries.toString();
    }

    @GetMapping("/getCountryById")
    public void printCountryById(){
        Optional<CountryModel> countryById = countriesService.findCountryById(2);
        System.out.println(countryById);
    }
}

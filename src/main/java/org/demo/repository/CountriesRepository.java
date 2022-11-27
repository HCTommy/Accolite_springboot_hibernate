package org.demo.repository;

import org.demo.model.CountryModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountriesRepository extends JpaRepository<CountryModel,Integer> {
}

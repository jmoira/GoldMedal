package com.codecademy.goldmedal.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codecademy.goldmedal.model.GoldMedal;
import com.codecademy.goldmedal.model.Country;

public interface GoldMedalRepository extends CrudRepository<GoldMedal, Integer> {
    Integer countByCountry(String country);
    Integer countBySeason(String season);
    Integer countByCountryAndGender(String countryName, String gender);
    List<GoldMedal> getByCountryOrderByYearAsc(String name);
    List<GoldMedal> getByCountryOrderByYearDesc(String name);
    List<GoldMedal> getByCountryOrderBySeasonAsc(String name);
    List<GoldMedal> getByCountryOrderBySeasonDesc(String name);
    List<GoldMedal> getByCountryOrderByCityAsc(String name);
    List<GoldMedal> getByCountryOrderByCityDesc(String name);
    List<GoldMedal> getByCountryOrderByNameAsc(String name);
    List<GoldMedal> getByCountryOrderByNameDesc(String name);
    List<GoldMedal> getByCountryOrderByEventAsc(String name);
    List<GoldMedal> getByCountryOrderByEventDesc(String name);
    List<GoldMedal> getByCountryAndSeasonOrderByYearAsc(String countryName, String season);

}

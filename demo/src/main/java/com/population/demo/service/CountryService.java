package com.population.demo.service;


import com.population.demo.model.Country;

import com.population.demo.repository.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.transaction.Transactional;

@Service
@Transactional
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;
  
    public List<Country> listAllCountries() {
        return countryRepository.findAll();
    }
 
 
    
    /* getAllCountryPopulations()
     * getAllCountryCurrencies()
     * validateState(country_code, state_code)
     * addState(country_cd, state_cd, state_name, state_population)
     */
     
    
    /*public void saveUser(User user) {
        userRepository.save(user);
    }

    public User getUser(Integer id) {
        return userRepository.findById(id).get();
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }*/
    
    
}


package com.example.Learningspringdataelasticsearch.service;


import com.example.Learningspringdataelasticsearch.document.Person;
import com.example.Learningspringdataelasticsearch.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    public PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public void save(final Person person) {
        personRepository.save(person);
    }

    public Person findById(final String id) {
        return personRepository.findById(id).orElse(null);
    }

}

package com.example.Learningspringdataelasticsearch.personcontroller;


import com.example.Learningspringdataelasticsearch.document.Person;
import com.example.Learningspringdataelasticsearch.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }



    @GetMapping("/{personid}")
    public Person getPersons(@PathVariable("personid") String personId) {
        return personService.findById(personId);
    }

    @PostMapping("/addperson")
    public void addNewPerson(@RequestBody Person person) {
        personService.save(person);
    }
}

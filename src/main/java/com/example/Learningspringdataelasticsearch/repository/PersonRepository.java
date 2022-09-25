package com.example.Learningspringdataelasticsearch.repository;

import com.example.Learningspringdataelasticsearch.document.Person;
import org.elasticsearch.repositories.Repository;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PersonRepository extends ElasticsearchRepository<Person,String> {
}

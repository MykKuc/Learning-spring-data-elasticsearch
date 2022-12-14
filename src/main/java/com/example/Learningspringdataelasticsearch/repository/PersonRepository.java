package com.example.Learningspringdataelasticsearch.repository;

import com.example.Learningspringdataelasticsearch.document.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends ElasticsearchRepository<Person,String> {
}

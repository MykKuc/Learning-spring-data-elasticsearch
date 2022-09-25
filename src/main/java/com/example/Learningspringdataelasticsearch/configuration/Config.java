package com.example.Learningspringdataelasticsearch.configuration;


import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;


@Configuration
@EnableElasticsearchRepositories(basePackages = "com.example.Learningspringdataelasticsearch.repository")
@ComponentScan(basePackages = "com.example.Learningspringdataelasticsearch")
public class Config extends AbstractElasticsearchConfiguration {

   /* @Value("${elasticsearch.url}")
    public String elasticsearchUrl;*/

    @Bean
    @Override
    public RestHighLevelClient elasticsearchClient() {
        final ClientConfiguration CONFIG = ClientConfiguration.builder()
                .connectedTo("localhost:9200")
                .build();

        return RestClients.create(CONFIG).rest();
    }
}

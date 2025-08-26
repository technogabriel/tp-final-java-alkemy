package com.bbva.integrador.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.bbva.integrador.repository")
public class MongoConfig {
}

package com.example.demo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DemoRespository extends MongoRepository<Demo, String>{

}

package com.harshsengar.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.harshsengar.data.ToDo;

public interface ToDoRepository extends MongoRepository<ToDo, String> {

}

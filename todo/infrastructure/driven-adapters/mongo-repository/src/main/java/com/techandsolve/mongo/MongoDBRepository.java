package com.techandsolve.mongo;

import com.techandsolve.model.todolist.TodoList;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoDBRepository extends ReactiveMongoRepository<TodoList/* change for adapter model */, String> {
}

package com.techandsolve.mongo;

import com.techandsolve.model.todolist.TodoList;
import com.techandsolve.model.todolist.gateways.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ApiService implements TodoListService {
    @Autowired
    private MongoDBRepository mongoDBRepository;
    @Override
    public Flux<TodoList> getAllTodo() {
        return mongoDBRepository.findAll();
    }

    @Override
    public Mono<Void> deleteTodo(String id) {return mongoDBRepository.deleteById(id);
    }

    @Override
    public Mono<TodoList> createTodo(TodoList todo) {return mongoDBRepository.save(todo);
    }

    @Override
    public Mono<TodoList> editTodo(TodoList todo) {
        return mongoDBRepository.save(todo);
    }

    @Override
    public Mono<TodoList> getTodo(String id) {
        return mongoDBRepository.findById(id);
    }
}

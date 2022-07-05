package com.techandsolve.model.todolist.gateways;

import com.techandsolve.model.todolist.TodoList;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface TodoListService {

    Flux <TodoList> getAllTodo ();
    Mono<Void> deleteTodo (String id);
    Mono<TodoList> createTodo (TodoList todo);
    Mono <TodoList> editTodo (TodoList todo);
    Mono <TodoList> getTodo(String id);
}

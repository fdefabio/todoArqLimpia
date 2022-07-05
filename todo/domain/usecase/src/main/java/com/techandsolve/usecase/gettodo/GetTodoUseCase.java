package com.techandsolve.usecase.gettodo;

import com.techandsolve.model.todolist.TodoList;
import com.techandsolve.model.todolist.gateways.TodoListService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class GetTodoUseCase {

    private final TodoListService todoListService;

    public Mono<TodoList> getTodo(String id){
        return todoListService.getTodo(id);
    }
}

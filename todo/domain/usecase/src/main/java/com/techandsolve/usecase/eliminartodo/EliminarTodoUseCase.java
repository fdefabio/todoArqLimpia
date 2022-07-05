package com.techandsolve.usecase.eliminartodo;

import com.techandsolve.model.todolist.TodoList;
import com.techandsolve.model.todolist.gateways.TodoListService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class EliminarTodoUseCase {

    private final TodoListService todoListService;

    public Mono<Void> deleteTodo(String id){
       return todoListService.deleteTodo(id);
    }
}

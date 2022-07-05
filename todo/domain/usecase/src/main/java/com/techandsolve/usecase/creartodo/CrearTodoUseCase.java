package com.techandsolve.usecase.creartodo;

import com.techandsolve.model.todolist.TodoList;
import com.techandsolve.model.todolist.gateways.TodoListService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class CrearTodoUseCase {


    private final TodoListService todoListService;

    public Mono<TodoList> Create(TodoList todo){
         return todoListService.createTodo(todo);
    }


}

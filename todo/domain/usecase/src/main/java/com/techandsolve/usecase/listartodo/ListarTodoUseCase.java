package com.techandsolve.usecase.listartodo;

import com.techandsolve.model.todolist.TodoList;
import com.techandsolve.model.todolist.gateways.TodoListService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
public class ListarTodoUseCase {

    private  final TodoListService todoListService;

    public Flux<TodoList> getAll(){
        return todoListService.getAllTodo();
    }
}

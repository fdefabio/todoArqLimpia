package com.techandsolve.usecase.edittodo;

import com.techandsolve.model.todolist.TodoList;
import com.techandsolve.model.todolist.gateways.TodoListService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class EditTodoUseCase {

    private final TodoListService todoListService;

    public Mono<TodoList> editTodo(TodoList todo){
       return todoListService.editTodo(todo);
    }
}

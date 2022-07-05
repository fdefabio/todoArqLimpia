package com.techandsolve.api;

/*import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;


@Configuration
public class RouterRest {
@Bean
public RouterFunction<ServerResponse> routerFunction(Handler handler) {
    return route(GET("/api/usecase/path"), handler::listenGETUseCase)
    .andRoute(POST("/api/usecase/otherpath"), handler::listenPOSTUseCase).and(route(GET("/api/otherusercase/path"), handler::listenGETOtherUseCase));

    }
}*/

import com.techandsolve.model.todolist.TodoList;
import com.techandsolve.usecase.creartodo.CrearTodoUseCase;
import com.techandsolve.usecase.edittodo.EditTodoUseCase;
import com.techandsolve.usecase.eliminartodo.EliminarTodoUseCase;
import com.techandsolve.usecase.gettodo.GetTodoUseCase;
import com.techandsolve.usecase.listartodo.ListarTodoUseCase;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/index")
@AllArgsConstructor
public class RouterRest{

    @Autowired
    private final CrearTodoUseCase crearTodoUseCase;

    @Autowired
    private final ListarTodoUseCase listarTodoUseCase;

    @Autowired
    private final GetTodoUseCase getTodoUseCase;

    @Autowired
    private final EliminarTodoUseCase eliminarTodoUseCase;

    @Autowired
    private final EditTodoUseCase editTodoUseCase;

    @PostMapping("/save")
    public Mono<TodoList> saveTodo(@RequestBody TodoList todo){
         return crearTodoUseCase.Create(todo);
    }

    @PostMapping("/edit")
    public Mono<TodoList> editTodo(@RequestBody TodoList todo){
        return editTodoUseCase.editTodo(todo);
    }

    @GetMapping("/getAll")
    public Flux <TodoList> getAll(){
       return listarTodoUseCase.getAll();
    }

    @GetMapping("/getTodo/{id}")
    public Mono<TodoList> getTodo(@PathVariable String id){
        return getTodoUseCase.getTodo(id);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> deleteTodo(@PathVariable String id){
        return eliminarTodoUseCase.deleteTodo(id);
    }


}

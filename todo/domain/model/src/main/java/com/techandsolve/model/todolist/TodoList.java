package com.techandsolve.model.todolist;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class TodoList {
    private String id;
    private String name;
    private String date;
    private Integer position;

}

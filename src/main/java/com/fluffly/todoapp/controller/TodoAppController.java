package com.fluffly.todoapp.controller;

import com.fluffly.todoapp.model.Todo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/homepage")
public class TodoAppController {
    @GetMapping
    public String todoHomepage()
    {
        return "Welcome to my new small todo app!";
    }
    @PostMapping
    public Todo createTodo(@RequestBody Todo todo)
    {
        return todo;
    }

}

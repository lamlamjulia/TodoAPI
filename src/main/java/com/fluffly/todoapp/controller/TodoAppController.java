package com.fluffly.todoapp.controller;

import com.fluffly.todoapp.model.Todo;
import com.fluffly.todoapp.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping(path = "/homepage")
public class TodoAppController {
    private TodoService service;
    public TodoAppController(TodoService service) {
        this.service = service;
    }
    @GetMapping
    public List<Todo> getAllTodos() {
        return service.getAllTodos();
    }
    @GetMapping("/{id}")
    public Todo getTodoById(@PathVariable Long id) {
        return service.getTodoById(id);
    }
    @PostMapping
    public Todo createTodo(@Valid @RequestBody Todo todo)
    {
        return service.createTodo(todo);
    }
    @PutMapping("/{id}")
    public Todo update(@PathVariable Long id, @Valid @RequestBody Todo updated)
    {
        return service.updateTodo(id, updated);
    }
    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        service.deleteTodo(id);
    }


}

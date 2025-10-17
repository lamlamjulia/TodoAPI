package com.fluffly.todoapp.service;

import com.fluffly.todoapp.model.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private List<Todo> todoList;
    public List<Todo> getAllTodos()
    {
        return null;
    }
    public Todo createTodo(Todo todo)
    {
        return todo;
    }
    public Todo getTodoById(int id)
    {
        return todoList.get(id);
    }
    public Todo updateTodo(int id, Todo updatedTodo)
    {
        return updatedTodo;
    }
    public void deleteTodo(int id)
    {
        todoList.remove(id);
    }
}

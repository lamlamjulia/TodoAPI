package com.fluffly.todoapp.service;

import com.fluffly.todoapp.model.Todo;
import com.fluffly.todoapp.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TodoService {
    private TodoRepository repo;
    public TodoService(TodoRepository repo) {
        this.repo = repo;
    }
    public List<Todo> getAllTodos()
    {
        return repo.findAll();
    }
    public Todo createTodo(Todo todo)
    {
        return repo.save(todo);
    }
    public Todo getTodoById(Long id)
    {
        return repo.findById(id).orElse(null);
    }
    public Todo updateTodo(Long id, Todo updatedTodo)
    {
        Todo current = getTodoById(id);
        current.setId(updatedTodo.getId());
        current.setTaskName(updatedTodo.getTaskName());
        current.setDeadline(updatedTodo.getDeadline());
        current.setDone(updatedTodo.isDone());
        current.setDescription(updatedTodo.getDescription());
        return repo.save(current);
    }
    public void deleteTodo(Long id)
    {
        repo.deleteById(id);
    }
}

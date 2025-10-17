package com.fluffly.todoapp.model;

public class Todo {
    String taskName;
    static int taskId = 0;
    boolean done;
    String description;
    String deadline;
    public Todo(String taskName, boolean done, String description, String deadline) {
        this.taskName = taskName;
        taskId++;
        this.done = done;
        this.description = description;
        this.deadline = deadline;
    }
    public String getTaskName() {
        return taskName;
    }
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    public int getTaskId() {
        return taskId;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDeadline() {
        return deadline;
    }
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}

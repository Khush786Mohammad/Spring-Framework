package com.khush.todo_api.controller;

import com.khush.todo_api.dto.TaskRequestDto;
import com.khush.todo_api.entity.Task;
import com.khush.todo_api.exceptions.TaskNotFoundException;
import com.khush.todo_api.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService service) {
        this.taskService = service;
    }

    @GetMapping("/tasks")
    public ResponseEntity<Object> getTasks() {
        List<Task> tasks = taskService.fetchTasks();
        if (tasks != null && !tasks.isEmpty())
            return ResponseEntity.status(HttpStatus.OK).body(tasks);
        return ResponseEntity.status(HttpStatus.OK).body("No task available");
    }

    @GetMapping("/tasks/{id}")
    public ResponseEntity<Object> getTask(@PathVariable("id") Long id) throws TaskNotFoundException {
        Task task = null;
        task = this.taskService.fetchTaskById(id);
        return ResponseEntity.status(HttpStatus.OK).body(task);
    }

    @PostMapping(value = "/tasks", consumes = "application/json")
    public ResponseEntity<Object> addTask(@RequestBody TaskRequestDto dtoTask) {
        Task task = new Task();

        task.setTitle(dtoTask.getTitle());
        task.setDescription(dtoTask.getDescription());

        Task result = this.taskService.addNewTask(task);
        if (result != null)
            return ResponseEntity.status(HttpStatus.CREATED).body(result);
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to add task");
    }

    @PutMapping(value = "/tasks", consumes = "application/json")
    public ResponseEntity<Object> updateTask(@RequestBody TaskRequestDto dtoTask) throws TaskNotFoundException {
        Task task = new Task();

        task.setId(dtoTask.getId());
        task.setTitle(dtoTask.getTitle());
        task.setDescription(dtoTask.getDescription());

        Task obj = null;
        obj = this.taskService.fetchTaskById((long) task.getId());

        if (obj != null) {
            this.taskService.updateTask(task);
            return ResponseEntity.status(HttpStatus.OK).body("Task updated successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Failed to update task");
        }
    }

    @DeleteMapping("/tasks/{id}")
    public ResponseEntity<Object> deleteTask(@PathVariable("id") Long id) throws TaskNotFoundException {
        Task obj = null;
        obj = this.taskService.fetchTaskById(id);
        this.taskService.deleteTask(id);
        return ResponseEntity.status(HttpStatus.OK).body("Task id: " + id + " deleted successfully");

    }

    @PatchMapping("/tasks/{id}")
    public ResponseEntity<Object> completeTask(@PathVariable("id") Long id) {
        int updatedRows = this.taskService.markComplete(id);
        if (updatedRows >= 1)
            return ResponseEntity.status(HttpStatus.OK).body("Task marked as complete");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Task not found");
    }

    @GetMapping("/tasks-completed")
    public ResponseEntity<Object> fetchCompletedTask(@RequestParam("completed") boolean completed) {
        List<Task> tasks = null;
        if (completed)
            tasks = this.taskService.getCompletedTask();
        return ResponseEntity.status(HttpStatus.OK).body(tasks);
    }
}

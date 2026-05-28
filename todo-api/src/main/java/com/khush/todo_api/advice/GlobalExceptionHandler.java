package com.khush.todo_api.advice;

import com.khush.todo_api.exceptions.TaskNotFoundException;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
@Order(1)
public class GlobalExceptionHandler {
    @ExceptionHandler(TaskNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleTaskNotFoundException(TaskNotFoundException exception) {
        Map<String, String> handler = new HashMap<>();
        handler.put("Errors", exception.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(handler);
    }
}

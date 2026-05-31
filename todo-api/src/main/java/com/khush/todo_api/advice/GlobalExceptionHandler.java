package com.khush.todo_api.advice;

import com.khush.todo_api.exceptions.TaskNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
@Order(1)
public class GlobalExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(TaskNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleTaskNotFoundException(TaskNotFoundException exception) {
        logger.info("Inside the handleTaskNotFoundException Method");
        Map<String, String> handler = new HashMap<>();
        handler.put("Errors", exception.getMessage());
        logger.error("Task not found");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(handler);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidException(MethodArgumentNotValidException exception) {
        logger.info("Inside the handleValidException method of GlobalExceptionHandler class");
        Map<String, String> handler = new HashMap<>();

        exception.getBindingResult()
                .getFieldErrors()
                .forEach(error ->
                        handler.put(error.getField(), error.getDefaultMessage()));
        logger.error("Arguments are not valid");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(handler);
    }
}

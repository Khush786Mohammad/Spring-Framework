package com.khush.notes_api.advice;

import com.khush.notes_api.exceptions.NotesNotFoundException;
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
    private static final String ClassName = "GlobalExceptionHandler Class";

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidException(final MethodArgumentNotValidException exception) {
        logger.info("Inside the handleValidException of {}", ClassName);
        final Map<String, String> message = new HashMap<>();
        exception
                .getBindingResult()
                .getFieldErrors()
                .forEach(error -> message.put(error.getField(), error.getDefaultMessage()));
        logger.error("Method argument are not valid");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(message);
    }

    @ExceptionHandler(NotesNotFoundException.class)
    public ResponseEntity<Map<String, String>> notesNotFoundException(final NotesNotFoundException exception) {
        logger.info("Inside the notesNotFoundException of {}", ClassName);
        logger.error("Failed to find the notes with requested id");
        final Map<String, String> handler = new HashMap<>();
        handler.put("error", exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(handler);
    }
}

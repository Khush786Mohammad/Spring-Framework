package com.khush.todo_api.exceptions;

import java.io.Serial;

public class TaskNotFoundException extends Exception {
	@Serial
    private static final long serialVersionUID = 1L;

	public TaskNotFoundException(String message) {
		super(message);
	}
}

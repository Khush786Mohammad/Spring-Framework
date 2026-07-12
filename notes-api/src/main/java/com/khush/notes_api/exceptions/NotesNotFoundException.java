package com.khush.notes_api.exceptions;

import java.io.Serial;

public class NotesNotFoundException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public NotesNotFoundException(String message) {
        super(message);
    }
}

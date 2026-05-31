package com.khush.todo_api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TaskRequestDto {
    private int id;

    @NotBlank(message = "Task title cannot be empty")
    @Size(min = 3, max = 100)
    private String title;

    @NotBlank(message = "Task description cannot be empty")
    @Size(min = 10, max = 500)
    private String description;
}

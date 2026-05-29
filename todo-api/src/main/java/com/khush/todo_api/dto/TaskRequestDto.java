package com.khush.todo_api.dto;

import lombok.Data;

@Data
public class TaskRequestDto {
    private int id;
    private String title;
    private String description;
}

package com.khush.notes_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotesResponseDTO {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime crtDt;
    private LocalDateTime lstUpdtDt;
}
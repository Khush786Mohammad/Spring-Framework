package com.khush.notes_api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Represent the Notes request format.")
public class NotesRequestDTO {
    @Schema(description = "Unique identifier of the notes", example = "1001", accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @NotBlank
    @Size(min = 5)
    @Schema(description = "Title of the note.", example = "Implement Swagger API Documentation")
    private String title;

    @NotBlank
    @Size(min = 20)
    @Schema(description = "Content of the requested notes")
    private String content;
}

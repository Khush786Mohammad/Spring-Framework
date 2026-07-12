package com.khush.notes_api.controller;

import com.khush.notes_api.dto.NotesRequestDTO;
import com.khush.notes_api.entity.Notes;
import com.khush.notes_api.exceptions.NotesNotFoundException;
import com.khush.notes_api.service.NotesService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mynotes")
public class NotesController {
    private static final Logger logger = LoggerFactory.getLogger(NotesController.class);
    private final NotesService service;

    @GetMapping(value = "/notes/{id}")
    public ResponseEntity<Notes> getNote(@PathVariable long id) throws NotesNotFoundException {
        System.out.println("Get Note Method");
        logger.info("Inside the get note method.");
        Notes note = this.service.getNotesById(id);
        return ResponseEntity.status(HttpStatus.OK).body(note);
    }

    @GetMapping(value = "/notes")
    public ResponseEntity<List<Notes>> fetchAllNotes() {
        List<Notes> notes = this.service.getAllNotes();
        return ResponseEntity.status(HttpStatus.OK).body(notes);
    }

    @PostMapping(value = "/notes", consumes = "application/json")
    public ResponseEntity<Notes> createNewNotes(@Valid @RequestBody NotesRequestDTO notesDto) {
        logger.info("Inside the Create new Notes of NotesController");
        Notes notes = new Notes();
        notes.setTitle(notesDto.getTitle());
        notes.setContent(notesDto.getContent());

        Notes newNote = this.service.addNote(notes);
        return ResponseEntity.status(HttpStatus.CREATED).body(newNote);
    }

    @PutMapping(value = "/notes")
    public ResponseEntity<String> updateNote(@RequestBody NotesRequestDTO notes) throws NotesNotFoundException {
        logger.info("Inside the Update method of Notes Controller");
        Long id = notes.getId();
        Notes note1 = this.service.getNotesById(id);
        assert note1 != null;
        Notes updatedNote = new Notes();
        updatedNote.setId(notes.getId());
        updatedNote.setTitle(notes.getTitle());
        updatedNote.setContent(notes.getContent());

        this.service.updateNotes(updatedNote);
        logger.info("End of Update method of Notes Controller");
        return ResponseEntity.status(HttpStatus.OK).body("Notes Updated Successfully");
    }

    @DeleteMapping(value = "/notes/{id}")
    public ResponseEntity<Object> deleteNotes(@PathVariable Long id) throws NotesNotFoundException {
        Notes notes = this.service.getNotesById(id);
        logger.info("Notes data with id: {}", notes);
        this.service.deleteNotesById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Note deleted successfully.");
    }

    @Autowired
    public NotesController(NotesService service1) {
        this.service = service1;
    }
}

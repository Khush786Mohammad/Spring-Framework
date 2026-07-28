package com.khush.notes_api.controller;

import com.khush.notes_api.dto.NotesRequestDTO;
import com.khush.notes_api.dto.NotesResponseDTO;
import com.khush.notes_api.entity.Notes;
import com.khush.notes_api.entity.User;
import com.khush.notes_api.exceptions.NotesNotFoundException;
import com.khush.notes_api.service.AuthenticationService;
import com.khush.notes_api.service.NotesService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mynotes")
public class NotesController {
    private static final Logger logger = LoggerFactory.getLogger(NotesController.class);
    private final NotesService service;
    private final AuthenticationService authService;

    @GetMapping(value = "/notes/{id}")
    public ResponseEntity<NotesResponseDTO> getNote(@PathVariable long id) throws NotesNotFoundException {
        logger.info("Inside the get note method.");
        User user = this.authService.getLoggedInUser();
        NotesResponseDTO note = this.service.getNotesById(id, user.getId());
        return ResponseEntity.status(HttpStatus.OK).body(note);
    }

    @GetMapping(value = "/notes")
    public ResponseEntity<Page<NotesResponseDTO>> fetchAllNotes(@RequestParam(name = "pageNo", required = false, defaultValue = "0") int pageNo,
                                                                @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize,
                                                                @RequestParam(name = "sortField", required = false, defaultValue = "crtDt") String sortField,
                                                                @RequestParam(name = "order", required = false, defaultValue = "asc") String order
    ) {
        Sort sort = order.equals("asc") ? Sort.by(sortField).ascending() : Sort.by(sortField).descending();
        User user = this.authService.getLoggedInUser();
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
        Page<NotesResponseDTO> notes = this.service.getAllNotes(user.getId(), pageable);
        return ResponseEntity.status(HttpStatus.OK).body(notes);
    }

    @PostMapping(value = "/notes", consumes = "application/json")
    public ResponseEntity<NotesResponseDTO> createNewNotes(@Valid @RequestBody NotesRequestDTO notesDto) {
        logger.info("Inside the Create new Notes of NotesController");
        Notes notes = new Notes();
        notes.setTitle(notesDto.getTitle());
        notes.setContent(notesDto.getContent());

        User user = this.authService.getLoggedInUser();
        notes.setUser(user);
        NotesResponseDTO newNote = this.service.addNote(notes);
        return ResponseEntity.status(HttpStatus.CREATED).body(newNote);
    }

    @PutMapping(value = "/notes")
    public ResponseEntity<String> updateNote(@RequestBody NotesRequestDTO notes) throws NotesNotFoundException {
        logger.info("Inside the Update method of Notes Controller");
        User user = this.authService.getLoggedInUser();
        NotesResponseDTO note1 = this.service.getNotesById(notes.getId(), user.getId());
        assert note1 != null;
        Notes updatedNote = new Notes();
        updatedNote.setId(notes.getId());
        updatedNote.setTitle(notes.getTitle());
        updatedNote.setContent(notes.getContent());
        updatedNote.setUser(user);
        this.service.updateNotes(updatedNote);
        logger.info("End of Update method of Notes Controller");
        return ResponseEntity.status(HttpStatus.OK).body("Notes Updated Successfully");
    }

    @DeleteMapping(value = "/notes/{id}")
    public ResponseEntity<Object> deleteNotes(@PathVariable Long id) throws NotesNotFoundException {
        User user = this.authService.getLoggedInUser();
        NotesResponseDTO notes = this.service.getNotesById(id, user.getId());
        logger.info("Notes data with id: {}", notes);
        this.service.deleteNotesById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Note deleted successfully.");
    }

    @Autowired
    public NotesController(NotesService service1, AuthenticationService authenticationService) {
        this.service = service1;
        this.authService = authenticationService;
    }
}

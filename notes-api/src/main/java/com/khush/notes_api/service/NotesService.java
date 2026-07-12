package com.khush.notes_api.service;

import com.khush.notes_api.entity.Notes;
import com.khush.notes_api.exceptions.NotesNotFoundException;
import com.khush.notes_api.repository.NotesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class NotesService {
    private static final Logger logger = LoggerFactory.getLogger(NotesService.class);
    private final NotesRepository repository;

    public Notes getNotesById(long id) throws NotesNotFoundException {
        Optional<Notes> note = this.repository.findById(id);
        if (note.isEmpty())
            throw new NotesNotFoundException("No Notes Found with id: " + id);
        return note.get();
    }

    public List<Notes> getAllNotes() {
        return this.repository.findAll();
    }

    @Transactional
    public Notes addNote(Notes note) {
        logger.info("Inside the addNote method of NotesService");
        return this.repository.save(note);
    }

    @Transactional
    public void updateNotes(Notes notes) {
        this.repository.save(notes);
    }

    @Transactional
    public void deleteNotesById(Long id) {
        this.repository.deleteById(id);
    }

    @Autowired
    public NotesService(NotesRepository repository) {
        this.repository = repository;
    }
}

package com.khush.notes_api.service;

import com.khush.notes_api.dto.NotesResponseDTO;
import com.khush.notes_api.entity.Notes;
import com.khush.notes_api.exceptions.NotesNotFoundException;
import com.khush.notes_api.mapper.NotesMapper;
import com.khush.notes_api.repository.NotesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NotesService {
    private static final Logger logger = LoggerFactory.getLogger(NotesService.class);
    private final NotesRepository repository;

    public NotesResponseDTO getNotesById(long id, long userId) throws NotesNotFoundException {
        Notes note = this.repository.findByIdAndUserId(id, userId).orElseThrow(() -> new NotesNotFoundException("No Notes Found with id: " + id));
        return NotesMapper.toDTO(note);
    }

    public Page<NotesResponseDTO> getAllNotes(Long user_id, Pageable pageable) {
        Page<Notes> notes = this.repository.findByUserId(user_id, pageable);
        return notes.map(NotesMapper::toDTO);
    }

    @Transactional
    public NotesResponseDTO addNote(Notes note) {
        logger.info("Inside the addNote method of NotesService");
        Notes data = this.repository.save(note);
        return NotesMapper.toDTO(data);
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

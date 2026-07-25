package com.khush.notes_api.repository;

import com.khush.notes_api.entity.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NotesRepository extends JpaRepository<Notes, Long> {
    Optional<Notes> findByIdAndUserId(Long id, Long user_id);
    List<Notes> findByUserId(Long user_id);
}

package com.khush.notes_api.repository;

import com.khush.notes_api.entity.Notes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NotesRepository extends JpaRepository<Notes, Long> {
    Page<Notes> findByUserId(Long id, Pageable pageable);
    Optional<Notes> findByIdAndUserId(Long id, Long user_id);
}

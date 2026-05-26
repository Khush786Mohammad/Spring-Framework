package com.khush.todo_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.khush.todo_api.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

	@Modifying
	@Query(value = "update task set completed = 1 WHERE id = :id", nativeQuery = true)
	int markAsComplete(@Param("id") Long id);

	List<Task> findByCompletedTrue();
}

package com.khush.todo_api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.khush.todo_api.entity.Task;
import com.khush.todo_api.exceptions.TaskNotFoundException;
import com.khush.todo_api.repository.TaskRepository;

@Service
public class TaskService {

	private final TaskRepository repository;

	@Autowired
	public TaskService(TaskRepository repo) {
		this.repository = repo;
	}

	public List<Task> fetchTasks() {
		return repository.findAll();
	}

	public Task fetchTaskById(Long id) throws TaskNotFoundException {
		Optional<Task> task = repository.findById(id);
		if (task.isEmpty()) {
			throw new TaskNotFoundException("No Task is found with id: " + id.toString());
		}
		return task.get();
	}

	@Transactional
	public Task addNewTask(Task task) {
		return repository.save(task);
	}

	@Transactional
	public void updateTask(Task task) {
		repository.save(task);
	}

	@Transactional
	public void deleteTask(Long id) {
		repository.deleteById(id);
	}

	@Transactional
	public int markComplete(Long id) {
		return repository.markAsComplete(id);
	}

	public List<Task> getCompletedTask() {
		return repository.findByCompletedTrue();
	}
}

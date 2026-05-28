package com.khush.todo_api.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

@Entity
@Table(name = "task")
public class Task {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "completed")
	private boolean completed;

	@Column(name = "crt_dt", updatable = false)
	private LocalDateTime crt_dt;

	@Column(name = "lst_updt_dt")
	private LocalDateTime lst_updt_dt;

	@PrePersist
	public void prePersist() {
		this.crt_dt = LocalDateTime.now();
	}

	@PreUpdate
	public void preUpdate() {
		this.lst_updt_dt = LocalDateTime.now();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public LocalDateTime getCrt_dt() {
		return crt_dt;
	}

	public void setCrt_dt(LocalDateTime crt_dt) {
		this.crt_dt = crt_dt;
	}

	public LocalDateTime getLst_updt_dt() {
		return lst_updt_dt;
	}

	public void setLst_updt_dt(LocalDateTime lst_updt_dt) {
		this.lst_updt_dt = lst_updt_dt;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", description=" + description + ", completed=" + completed
				+ ", crt_dt=" + crt_dt + ", lst_updt_dt=" + lst_updt_dt + "]";
	}
}

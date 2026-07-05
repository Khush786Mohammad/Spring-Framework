package com.khush.notes_api.entity;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Notes")
public class Notes {
    @Id
    @Column(name = "notes_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "crt_dt", updatable = false)
    private LocalDateTime crt_dt;

    @Column(name = "lst_updt_dt")
    private LocalDateTime lst_updt_dt;

    @PrePersist
    public void onSave() {
        this.crt_dt = LocalDateTime.now();
    }

    @PostConstruct
    public void lastUpdatedAt() {
        this.lst_updt_dt = LocalDateTime.now();
    }
}

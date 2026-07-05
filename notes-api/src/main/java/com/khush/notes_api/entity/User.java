package com.khush.notes_api.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sec_user_mst")
public class User {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="username")
    @Size(min = 5)
    @NotNull
    private String username;

    @NotNull
    @Size(min = 8)
    @Column(name="password")
    private String password;

    @Column(name="email")
    private String email;
}



package com.example.sync_intern_local_train_ticket_management_system.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRegistration {
    @Id
    @SequenceGenerator(name = "UserId",sequenceName = "UserId")
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "UserId")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;


    @Column(name = "gender")
    private String gender;
}

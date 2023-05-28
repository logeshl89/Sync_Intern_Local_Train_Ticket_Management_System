package com.example.sync_intern_local_train_ticket_management_system.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TrainSearchForm {
    @Id
    @SequenceGenerator(sequenceName = "id",name = "id")
    @GeneratedValue(generator = "id",strategy = GenerationType.SEQUENCE)
    private Long id;
    private String TrainName;
    private String source;
    private String destination;
    private String date;
    private String trainType;
    private LocalTime startTime;
    private LocalTime endTime;

}


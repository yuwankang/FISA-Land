package com.example.rentalsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class LendingRecords {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lending_record_id;

    private LocalDateTime created;

    // Getters and Setters
}

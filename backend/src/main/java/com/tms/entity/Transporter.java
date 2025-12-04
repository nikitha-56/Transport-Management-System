package com.tms.entity;

import jakarta.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Transporter {

    @Id
    @GeneratedValue
    private UUID transporterId;

    private String companyName;
    private double rating;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<TruckCapacity> availableTrucks;

    // Getters and Setters
}


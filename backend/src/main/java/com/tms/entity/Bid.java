package com.tms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class Bid {

    @Id
    @GeneratedValue
    private UUID bidId;

    @ManyToOne
    @JoinColumn(name = "load_id", nullable = false)
    private Load load;

    @ManyToOne
    @JoinColumn(name = "transporter_id", nullable = false)
    private Transporter transporter;

    private double proposedRate;
    private int trucksOffered;

    @Enumerated(EnumType.STRING)
    private BidStatus status; // PENDING, ACCEPTED, REJECTED

    private LocalDateTime submittedAt;
}

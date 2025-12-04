package com.tms.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Bid {

    @Id
    @GeneratedValue
    private UUID bidId;

    private UUID loadId;
    private UUID transporterId;
    private double proposedRate;
    private int trucksOffered;

    @Enumerated(EnumType.STRING)
    private BidStatus status; // PENDING, ACCEPTED, REJECTED

    private LocalDateTime submittedAt;

    // Getters and Setters
}

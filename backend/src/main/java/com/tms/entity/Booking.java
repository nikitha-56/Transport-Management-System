package com.tms.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Booking {

    @Id
    @GeneratedValue
    private UUID bookingId;

    private UUID loadId;
    private UUID bidId;
    private UUID transporterId;
    private int allocatedTrucks;
    private double finalRate;

    @Enumerated(EnumType.STRING)
    private BookingStatus status; // CONFIRMED, COMPLETED, CANCELLED

    private LocalDateTime bookedAt;

    // Getters and Setters
}


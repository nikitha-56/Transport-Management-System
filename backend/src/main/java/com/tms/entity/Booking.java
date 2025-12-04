package com.tms.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Booking {

    @Id
    @GeneratedValue
    private UUID bookingId;

    @ManyToOne
    @JoinColumn(name = "load_id", nullable = false)
    private Load load;

    @ManyToOne
    @JoinColumn(name = "bid_id", nullable = false)
    private Bid bid;

    @ManyToOne
    @JoinColumn(name = "transporter_id", nullable = false)
    private Transporter transporter;

    private int allocatedTrucks;
    private double finalRate;

    @Enumerated(EnumType.STRING)
    private BookingStatus status; // CONFIRMED, COMPLETED, CANCELLED

    private LocalDateTime bookedAt;
}

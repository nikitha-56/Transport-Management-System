package com.tms.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Load {

    @Id
    @GeneratedValue
    private UUID loadId;

    private String shipperId; // Assuming shippers are just represented by ID

    private String loadingCity;
    private String unloadingCity;
    private LocalDateTime loadingDate;
    private String productType;
    private double weight;
    private String weightUnit; // KG or TON
    private String truckType;
    private int noOfTrucks;

    @Enumerated(EnumType.STRING)
    private LoadStatus status; // POSTED, OPEN_FOR_BIDS, BOOKED, CANCELLED

    private LocalDateTime datePosted;

    @Version
    private Long version;

    @OneToMany(mappedBy = "load", cascade = CascadeType.ALL, orphanRemoval = true)
    private java.util.List<Bid> bids; // All bids for this load

    @OneToMany(mappedBy = "load", cascade = CascadeType.ALL, orphanRemoval = true)
    private java.util.List<Booking> bookings; // All bookings for this load
}

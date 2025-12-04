package com.tms.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transporter {

    @Id
    @GeneratedValue
    private UUID transporterId;

    private String companyName;
    private double rating;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TruckCapacity> availableTrucks;

    @OneToMany(mappedBy = "transporter", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Bid> bids; // Bids made by transporter

    @OneToMany(mappedBy = "transporter", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Booking> bookings; // Bookings by transporter
}

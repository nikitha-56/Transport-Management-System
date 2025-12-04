package com.tms.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data                 //for getters and setters
@NoArgsConstructor     
@AllArgsConstructor     
public class Load {

    @Id
    @GeneratedValue
    private UUID loadId;

    private String shipperId;
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
    private Long version; // for optimistic locking

}

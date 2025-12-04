package com.tms.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TruckCapacity {

    @Id
    @GeneratedValue
    private UUID id;

    private String truckType;
    private int count;
}

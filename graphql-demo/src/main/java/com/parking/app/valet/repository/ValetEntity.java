package com.parking.app.valet.repository;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class ValetEntity {
    @Id
    private UUID id;

    private String name;

    private String location;

    private Integer availableSlots;

//    private List<SlotEntity> slots;

    private LocalDateTime createdOn;
}

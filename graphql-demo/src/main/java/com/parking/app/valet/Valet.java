package com.parking.app.valet;

import com.parking.app.valet.slot.Slot;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Id;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
public class Valet {

    private UUID id;

    //TODO: not null library not found
    private String name;

    private String location;

    private Integer availableSlots;

    private List<Slot> slots;
}

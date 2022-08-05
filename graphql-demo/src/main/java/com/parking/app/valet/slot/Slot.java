package com.parking.app.valet.slot;

import com.parking.app.valet.vehicle.Vehicle;

import java.util.UUID;

public class Slot {
    private UUID id;

    private Boolean occupied;

    private Vehicle occupant;
}
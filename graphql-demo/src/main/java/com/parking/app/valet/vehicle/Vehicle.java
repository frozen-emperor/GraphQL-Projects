package com.parking.app.valet.vehicle;

import com.parking.app.valet.slot.Slot;
import com.parking.app.valet.user.User;

import java.util.UUID;

public class Vehicle {
    private UUID id;

    private Slot slot;

    private User owner;
}

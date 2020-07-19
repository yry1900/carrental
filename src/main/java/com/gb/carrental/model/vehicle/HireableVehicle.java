package com.gb.carrental.model.vehicle;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class HireableVehicle {
    private String id;
    private String licensePlantNumber;
    private String qrCode;
    private String make;
    private String model;
    private int yearOfManufacture;
    private double mileage;
    private int numberOfSeats;
    private VehicleType vehicleType;
    private VehicleStatus vehicleStatus;
}

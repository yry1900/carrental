package com.gb.rental.service;

import com.gb.rental.model.vehicle.HireableVehicle;
import com.gb.rental.model.vehicle.VehicleType;

import java.time.LocalDateTime;
import java.util.List;

public class VehicleSearchServiceImpl implements VehicleSearchService {
    @Override
    public List<HireableVehicle> searchByType(VehicleType vehicleType, String city,
                                              LocalDateTime fromDate, LocalDateTime toDate) {
        return null;
    }

    @Override
    public List<HireableVehicle> searchByModel(String make, String city,
                                               String model, LocalDateTime fromDate, LocalDateTime toDate) {
        return null;
    }

    @Override
    public List<HireableVehicle> searchByType(int seats, String city,
                                              LocalDateTime fromDate, LocalDateTime toDate) {
        return null;
    }
}
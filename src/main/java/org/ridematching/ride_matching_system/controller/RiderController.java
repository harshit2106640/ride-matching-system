package org.ridematching.ride_matching_system.controller;


import org.ridematching.ride_matching_system.dto.RideRequestDTO;
import org.ridematching.ride_matching_system.dto.RideResponseDTO;
import org.ridematching.ride_matching_system.service.RideService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ride")
public class RiderController {

    private final RideService rideService;

    public RiderController(RideService rideService) {
        this.rideService = rideService;
    }


    @PostMapping("/request")
    public RideResponseDTO requestRide(@RequestBody RideRequestDTO request){
        return rideService.processRideRequest(request);
    }
}
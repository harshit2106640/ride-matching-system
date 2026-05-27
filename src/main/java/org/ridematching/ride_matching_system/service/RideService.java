package org.ridematching.ride_matching_system.service;


import org.ridematching.ride_matching_system.dto.RideRequestDTO;
import org.ridematching.ride_matching_system.dto.RideResponseDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RideService {


    public RideResponseDTO processRideRequest(RideRequestDTO request){

        // Step 1: Generate unique rideId
        String rideId = UUID.randomUUID().toString();


        // Step 2: Build response
        RideResponseDTO response = new RideResponseDTO();

        response.setRideId(rideId);
        response.setStatus("REQUESTED");
        response.setMessage("Ride requested successfully by "+ request.getRiderName());

        // Step 3: Return response
        return response;
    }
}

package org.ridematching.ride_matching_system.dto;


import lombok.Data;

@Data
public class RideResponseDTO {
    private String rideId;
    private String status;
    private String message;
}

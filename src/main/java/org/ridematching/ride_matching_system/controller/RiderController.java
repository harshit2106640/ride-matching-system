package org.ridematching.ride_matching_system.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ride")
public class RiderController {

    @PostMapping("/request")
    public String requestRide(){
        return "Ride requested successfully!";
    }
}

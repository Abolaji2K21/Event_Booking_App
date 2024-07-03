package com.BeeJay_Event_Booking_App.My_App.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateOrganizerRequest {
    private String username;
    private String password;
}

package com.BeeJay_Event_Booking_App.My_App.services;

import com.BeeJay_Event_Booking_App.My_App.dtos.requests.CreateOrganizerRequest;
import com.BeeJay_Event_Booking_App.My_App.dtos.responds.CreateOrganizerResponse;
import org.springframework.stereotype.Service;

@Service
public interface OrganizerService {
    CreateOrganizerResponse register(CreateOrganizerRequest request);


}

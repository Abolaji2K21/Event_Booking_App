package com.BeeJay_Event_Booking_App.My_App.services;

import com.BeeJay_Event_Booking_App.My_App.dtos.requests.CreateOrganizerRequest;
import com.BeeJay_Event_Booking_App.My_App.dtos.responds.CreateOrganizerResponse;
import com.BeeJay_Event_Booking_App.My_App.exceptions.UserNotFoundException;
import com.BeeJay_Event_Booking_App.My_App.models.Organizer;
import org.springframework.stereotype.Service;

@Service
public interface OrganizerService {
    CreateOrganizerResponse register(CreateOrganizerRequest request);

    Organizer getById(Long userId) throws UserNotFoundException;

    Organizer getUserByUsername(String username) throws UserNotFoundException;


}

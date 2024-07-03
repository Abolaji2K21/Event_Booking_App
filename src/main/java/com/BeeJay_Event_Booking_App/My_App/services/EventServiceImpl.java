package com.BeeJay_Event_Booking_App.My_App.services;

import com.BeeJay_Event_Booking_App.My_App.dtos.requests.AddEventRequest;
import com.BeeJay_Event_Booking_App.My_App.dtos.responds.AddEventResponse;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService{

    @Override
    public AddEventResponse createEvent(AddEventRequest request) {
        return null;
    }
}

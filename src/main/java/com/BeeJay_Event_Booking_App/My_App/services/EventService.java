package com.BeeJay_Event_Booking_App.My_App.services;

import com.BeeJay_Event_Booking_App.My_App.dtos.requests.AddEventRequest;
import com.BeeJay_Event_Booking_App.My_App.dtos.responds.AddEventResponse;

public interface EventService {

    AddEventResponse createEvent(AddEventRequest request) ;

//    Event findEventBy(Long eventId) throws EventExistException;
//
//    Event save(Event event);
}

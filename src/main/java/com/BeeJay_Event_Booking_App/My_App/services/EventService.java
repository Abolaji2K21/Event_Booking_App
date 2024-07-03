package com.BeeJay_Event_Booking_App.My_App.services;

import com.BeeJay_Event_Booking_App.My_App.dtos.requests.AddEventRequest;
import com.BeeJay_Event_Booking_App.My_App.dtos.responds.AddEventResponse;
import com.BeeJay_Event_Booking_App.My_App.exceptions.EventExistException;
import com.BeeJay_Event_Booking_App.My_App.models.Event;
import com.BeeJay_Event_Booking_App.My_App.models.Organizer;

public interface EventService {
    AddEventResponse createEvent(AddEventRequest request, Organizer organizer) throws EventExistException;

    Event findEventBy(Long eventId) throws EventExistException;

    Event save(Event event, Organizer organizer);
}

package com.BeeJay_Event_Booking_App.My_App.exceptions;

public class EventNotFoundException extends RuntimeException{
    public EventNotFoundException(String message) {
        super(message);
    }
}

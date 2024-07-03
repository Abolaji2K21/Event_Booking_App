package com.BeeJay_Event_Booking_App.My_App.dtos.responds;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class AddEventResponse {
    private Long id;
    private String eventName;
    private LocalDate date;
}

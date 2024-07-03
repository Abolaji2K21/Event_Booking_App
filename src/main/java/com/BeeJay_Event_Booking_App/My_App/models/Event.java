package com.BeeJay_Event_Booking_App.My_App.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String eventName;
    private LocalDate date;
    private Integer attendees;
    private String description;
//    @Enumerated(value = EnumType.STRING)
//    private Category category;

}

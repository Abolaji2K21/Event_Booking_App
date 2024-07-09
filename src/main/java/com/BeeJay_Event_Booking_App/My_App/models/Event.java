package com.BeeJay_Event_Booking_App.My_App.models;

import com.BeeJay_Event_Booking_App.My_App.constant.Category;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Table(name = "event")
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String eventName;
    private String eventLocation;
    private LocalDate dateCreated;
    private Integer attendees;
    private String description;
    @Enumerated(value = EnumType.STRING)
    private Category category;
    @ManyToOne
    private Organizer organizer;
}

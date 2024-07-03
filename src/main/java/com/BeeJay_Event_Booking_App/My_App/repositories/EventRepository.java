package com.BeeJay_Event_Booking_App.My_App.repositories;

import com.BeeJay_Event_Booking_App.My_App.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface EventRepository extends JpaRepository<Event, Long> {
    Boolean existsByDateAndEventName(LocalDate date, String eventName);
    Event findEventByEventName(String eventName);

}
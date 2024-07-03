package com.BeeJay_Event_Booking_App.My_App.repositories;

import com.BeeJay_Event_Booking_App.My_App.models.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrganizerRepository extends JpaRepository<Organizer, Long> {
}

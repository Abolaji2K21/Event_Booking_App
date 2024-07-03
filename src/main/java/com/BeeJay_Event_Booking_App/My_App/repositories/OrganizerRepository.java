package com.BeeJay_Event_Booking_App.My_App.repositories;

import com.BeeJay_Event_Booking_App.My_App.models.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface OrganizerRepository extends JpaRepository<Organizer, Long> {
    @Query("Select u from Organizer u where u.username=:email")
    Optional<Organizer> findByEmail(String email);
}

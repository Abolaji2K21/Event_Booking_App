package com.BeeJay_Event_Booking_App.My_App.services;

import com.BeeJay_Event_Booking_App.My_App.dtos.requests.CreateOrganizerRequest;
import com.BeeJay_Event_Booking_App.My_App.dtos.responds.CreateOrganizerResponse;
import com.BeeJay_Event_Booking_App.My_App.models.Organizer;
import com.BeeJay_Event_Booking_App.My_App.repositories.OrganizerRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class OrganizerServiceImpl implements OrganizerService{

    private final OrganizerRepository organizerRepository;

    private final ModelMapper modelMapper;

    private final PasswordEncoder passwordEncoder;


    @Override
    public CreateOrganizerResponse register(CreateOrganizerRequest request) {

        Organizer organizer = modelMapper.map(request, Organizer.class);
        organizer.setPassword(passwordEncoder.encode(request.getPassword()));
        organizer = organizerRepository.save(organizer);

        var organizerResponse = modelMapper.map(organizer, CreateOrganizerResponse.class);
        organizerResponse.setMessage("User registered successfully");
        return organizerResponse;

    }
}

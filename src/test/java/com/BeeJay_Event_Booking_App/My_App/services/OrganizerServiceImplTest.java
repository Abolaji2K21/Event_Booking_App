package com.BeeJay_Event_Booking_App.My_App.services;

import com.BeeJay_Event_Booking_App.My_App.dtos.requests.CreateOrganizerRequest;
import com.BeeJay_Event_Booking_App.My_App.dtos.responds.CreateOrganizerResponse;
import com.BeeJay_Event_Booking_App.My_App.repositories.OrganizerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@Sql(scripts = {"/db/data.sql"})
class OrganizerServiceImplTest {

    @Autowired
    private OrganizerService organizerService;

    @Autowired
    private OrganizerRepository organizerRepository;

    @Test
    void testAdminCanRegisterSuccessfully() {
        CreateOrganizerRequest organizerRequest = new CreateOrganizerRequest();
        organizerRequest.setUsername("Organizer@test");
        organizerRequest.setPassword("password");
        CreateOrganizerResponse organizerResponse = organizerService.register(organizerRequest);
        assertNotNull(organizerResponse);
        assertTrue(organizerResponse.getMessage().contains("successfully"));

    }
}
package com.BeeJay_Event_Booking_App.My_App.services;

import com.BeeJay_Event_Booking_App.My_App.dtos.requests.CreateOrganizerRequest;
import com.BeeJay_Event_Booking_App.My_App.dtos.responds.CreateOrganizerResponse;
import com.BeeJay_Event_Booking_App.My_App.exceptions.UserNotFoundException;
import com.BeeJay_Event_Booking_App.My_App.models.Organizer;
import com.BeeJay_Event_Booking_App.My_App.repositories.OrganizerRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Sql(scripts = {"/db/data.sql"})
class OrganizerServiceImplTest {

    @Autowired
    private OrganizerService organizerService;

    @Autowired
    private OrganizerRepository organizerRepository;

    @Test
    void testOrganizerCanRegisterSuccessfully() {
        CreateOrganizerRequest organizerRequest = new CreateOrganizerRequest();
        organizerRequest.setUsername("Organizer@test");
        organizerRequest.setPassword("password");
        CreateOrganizerResponse organizerResponse = organizerService.register(organizerRequest);
        assertNotNull(organizerResponse);
        assertTrue(organizerResponse.getMessage().contains("successfully"));

    }
    @Test
    @DisplayName("test that organizer can be retrieved by id ")
    public  void testGetOrganizerById() throws UserNotFoundException {
        Organizer organizer = organizerService.getById(200L);
        assertThat(organizer).isNotNull();
    }

}
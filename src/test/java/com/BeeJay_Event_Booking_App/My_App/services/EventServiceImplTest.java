package com.BeeJay_Event_Booking_App.My_App.services;

import com.BeeJay_Event_Booking_App.My_App.constant.Category;
import com.BeeJay_Event_Booking_App.My_App.dtos.requests.AddEventRequest;
import com.BeeJay_Event_Booking_App.My_App.dtos.responds.AddEventResponse;
import com.BeeJay_Event_Booking_App.My_App.exceptions.EventExistException;
import com.BeeJay_Event_Booking_App.My_App.models.Event;
import com.BeeJay_Event_Booking_App.My_App.models.Organizer;
import com.BeeJay_Event_Booking_App.My_App.repositories.EventRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import java.time.LocalDate;
import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
@Sql(scripts = {"/db/data.sql"})
class EventServiceImplTest {


    private EventRepository eventRepository;
    private EventService eventService;


    @Test
    void test_That_You_Can_Create_Event_Successfully() throws EventExistException {
        AddEventRequest request = new AddEventRequest();
        request.setEventName("Marketing Conference");
        request.setDate(LocalDate.of(2024, 7, 14));
        request.setAttendees(200);
        request.setDescription("Two-day conference");
        request.setCategory(String.valueOf(Category.CONFERENCE));

        Organizer organizer = new Organizer();
        AddEventResponse response = eventService.createEvent(request, organizer);


        assertThat(response).isNotNull();
        assertThat("Birthday party").isEqualTo(request.getEventName());



    }

}
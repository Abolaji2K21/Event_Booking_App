package com.BeeJay_Event_Booking_App.My_App.services;

import com.BeeJay_Event_Booking_App.My_App.constant.Category;
import com.BeeJay_Event_Booking_App.My_App.dtos.requests.AddEventRequest;
import com.BeeJay_Event_Booking_App.My_App.dtos.responds.AddEventResponse;
import com.BeeJay_Event_Booking_App.My_App.exceptions.EventExistException;
import com.BeeJay_Event_Booking_App.My_App.models.Event;
import com.BeeJay_Event_Booking_App.My_App.models.Organizer;
import com.BeeJay_Event_Booking_App.My_App.repositories.EventRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@Sql(scripts = {"/db/data.sql"})
class EventServiceImplTest {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
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
        organizer.setId(200L);
        AddEventResponse response = eventService.createEvent(request, organizer);

        assertThat(response).isNotNull();
        assertThat("Marketing Conference").isEqualTo(request.getEventName());
    }

    @Test
    @DisplayName("test that event can be retrieved by id")
    public void testThatEventCanBeGottenByTheId() throws EventExistException {
        Event event = eventService.findEventBy(100L);
        assertThat(event).isNotNull();
    }

    @Test
    void test_That_You_Cant_Create_The_Same_Event_Twice() throws EventExistException {
        AddEventRequest request = new AddEventRequest();
        request.setEventName("Birthday_Party");
        request.setDate(LocalDate.of(2024, 6, 15));
        request.setAttendees(50);
        request.setDescription("Food full everywhere");
        request.setCategory(String.valueOf(Category.SOCIAL));

        Organizer organizer = new Organizer();
        organizer.setId(200L);

        AddEventResponse response = eventService.createEvent(request, organizer);
        assertThat(response).isNotNull();

        try {
            eventService.createEvent(request, organizer);
        } catch (EventExistException message) {
            assertEquals("EVENT_ALREADY_EXIST", message.getMessage());
        }
    }


}

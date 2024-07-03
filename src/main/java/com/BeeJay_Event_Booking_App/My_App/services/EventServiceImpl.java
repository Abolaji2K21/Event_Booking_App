package com.BeeJay_Event_Booking_App.My_App.services;

import com.BeeJay_Event_Booking_App.My_App.dtos.requests.AddEventRequest;
import com.BeeJay_Event_Booking_App.My_App.dtos.responds.AddEventResponse;
import com.BeeJay_Event_Booking_App.My_App.exceptions.EventExistException;
import com.BeeJay_Event_Booking_App.My_App.models.Event;
import com.BeeJay_Event_Booking_App.My_App.models.Organizer;
import com.BeeJay_Event_Booking_App.My_App.repositories.EventRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EventServiceImpl implements EventService{

    private final EventRepository eventRepository;
    private final ModelMapper modelMapper;

    @Override
    public AddEventResponse createEvent(AddEventRequest request, Organizer organizer) throws EventExistException {
        if (eventRepository.existsByEventNameAndDateCreated(request.getEventName(), request.getDate())){
            throw new EventExistException("Event_With_This_Name_And_Date_Already_Exist");
        }

            Event event = modelMapper.map(request, Event.class);
            event.setOrganizerId(organizer);
            eventRepository.save(event);
            AddEventResponse response = new AddEventResponse();
            response.setId(event.getId());
            response.setEventName(request.getEventName());
            response.setDate(request.getDate());
            return response;
        }

    @Override
    public Event findEventBy(Long id) throws EventExistException {
        return eventRepository.findById(id).orElseThrow(
                ()->new EventExistException("EVENT_DOES_NOT_EXIST")
        );
    }

    public Event save(Event event, Organizer organizer) {
        Event myEvent = modelMapper.map(event, Event.class);
        myEvent.setOrganizerId(organizer);
        return eventRepository.save(myEvent);
    }
}
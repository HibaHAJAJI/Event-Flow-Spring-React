package EventFlow.service;


import EventFlow.dto.EventRequest;
import EventFlow.dto.EventResponse;

import java.util.List;

public interface EventService {

    EventResponse createEvent(EventRequest request);


    EventResponse getEventById(Long id);


    EventResponse updateEvent(EventRequest request,Long id);

    void deleteEvent(Long id);


    List<EventResponse> getAllEvents();

}

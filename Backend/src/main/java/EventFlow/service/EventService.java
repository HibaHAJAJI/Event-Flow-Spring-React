package EventFlow.service;


import EventFlow.dto.EventRequest;
import EventFlow.dto.EventResponse;

public interface EventService {

    EventResponse createEvent(EventRequest request);


    EventResponse getEventById(Long id);

}

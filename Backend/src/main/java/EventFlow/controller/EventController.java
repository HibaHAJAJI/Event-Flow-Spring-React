package EventFlow.controller;


import EventFlow.dto.EventRequest;
import EventFlow.dto.EventResponse;
import EventFlow.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api/event")
@RestController
@RequiredArgsConstructor
public class EventController {

    private final EventService service;

    @PostMapping
    public EventResponse addEvent(EventRequest request){
        return service.createEvent(request);
    }
}

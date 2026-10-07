package EventFlow.controller;


import EventFlow.dto.EventRequest;
import EventFlow.dto.EventResponse;
import EventFlow.entity.Event;
import EventFlow.service.EventService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/api/event")
@RestController
@RequiredArgsConstructor
public class EventController {

    private final EventService service;

    @PostMapping
    public EventResponse addEvent(@Valid @RequestBody EventRequest request){
        return service.createEvent(request);
    }

    @GetMapping("/id")
    public EventResponse getEventById(@PathVariable Long id){
        return service.getEventById(id);
    }
}

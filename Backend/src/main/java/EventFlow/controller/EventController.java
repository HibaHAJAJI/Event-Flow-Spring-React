package EventFlow.controller;


import EventFlow.dto.EventRequest;
import EventFlow.dto.EventResponse;
import EventFlow.entity.Event;
import EventFlow.service.EventService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/api/event")
@RestController
@RequiredArgsConstructor
public class EventController {

    private final EventService service;

    @PostMapping
    public ResponseEntity<EventResponse> addEvent(@Valid @RequestBody EventRequest request){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createEvent(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<EventResponse> getEventById(@PathVariable Long id){
        return ResponseEntity.ok(service.getEventById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EventResponse> updateEvent(@Valid @RequestBody EventRequest request, @PathVariable Long id){
        return ResponseEntity.ok(service.updateEvent(request,id)) ;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> DeleteEvent(@PathVariable Long id){
        service.deleteEvent(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<EventResponse>> getAllEvents(){
        return ResponseEntity.ok(service.getAllEvents()) ;
    }
}

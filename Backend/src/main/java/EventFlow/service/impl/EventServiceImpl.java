package EventFlow.service.impl;


import EventFlow.dto.EventRequest;
import EventFlow.dto.EventResponse;
import EventFlow.entity.Event;
import EventFlow.mapper.EventMapper;
import EventFlow.repository.EventRepository;
import EventFlow.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {

    private final EventMapper mapper;
    private final EventRepository repository;

    @Override
    public EventResponse createEvent(EventRequest request){
      Event event = mapper.toEntity(request);
      return mapper.toDto(repository.save(event));
    }

    @Override
    public EventResponse getEventById(Long id){
        Event event =repository.findById(id)
                .orElseThrow(()->new RuntimeException("Event non trouvé"));
        return mapper.toDto(event);

    }

   @Override
   public EventResponse updateEvent(EventRequest request,Long id){
        Event event = repository.findById(id)
                .orElseThrow(()->new RuntimeException("Event non trouvé"));

        mapper.updateEvent(event,request);

        Event update=repository.save(event);

        return mapper.toDto(update);
   }

   @Override
    public void deleteEvent(Long id){
       if (!repository.existsById(id)) {
           throw new RuntimeException("Event introuvable !");
       }
       repository.deleteById(id);

   }

   @Override
    public List<EventResponse> getAllEvents(){
        List<Event>events=repository.findAll();
        return mapper.toDtoList(events);
   }

}

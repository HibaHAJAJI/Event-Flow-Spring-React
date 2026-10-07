package EventFlow.service.impl;


import EventFlow.dto.EventRequest;
import EventFlow.dto.EventResponse;
import EventFlow.entity.Event;
import EventFlow.mapper.EventMapper;
import EventFlow.repository.EventRepository;
import EventFlow.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {

    private final EventMapper mapper;
    private final EventRepository repository;

    @Override
    public EventResponse createEvent(EventRequest request){
      Event event = mapper.toEntity(request);
      return mapper.toDto(event);
    }

    @Override
    public EventResponse getEventById(Long id){
        Event event =repository.findById(id)
                .orElseThrow(()->new RuntimeException("Event non trouvé"));
        return mapper.toDto(event);

    }

}

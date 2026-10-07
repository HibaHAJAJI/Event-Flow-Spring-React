package EventFlow.service.impl;


import EventFlow.dto.EventRequest;
import EventFlow.dto.EventResponse;
import EventFlow.entity.Event;
import EventFlow.mapper.EventMapper;
import EventFlow.repository.EventRepository;
import EventFlow.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {

    private final EventMapper mapper;

    @Override
    public EventResponse createEvent(EventRequest request){
      Event event = mapper.toEntity(request);
      return mapper.toDto(event);
    }


}

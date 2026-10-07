package EventFlow.mapper;


import EventFlow.dto.EventRequest;
import EventFlow.dto.EventResponse;
import EventFlow.entity.Event;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;


@Mapper(componentModel= "spring")
public interface EventMapper {

   Event toEntity(EventRequest request);

   EventResponse toDto (Event event);

   void updateEvent(@MappingTarget Event event,EventRequest request);

   List<EventResponse>toDtoList(List<Event>events);



}

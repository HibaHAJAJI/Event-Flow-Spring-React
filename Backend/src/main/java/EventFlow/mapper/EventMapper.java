package EventFlow.mapper;


import EventFlow.dto.EventRequest;
import EventFlow.dto.EventResponse;
import EventFlow.entity.Event;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;


@Mapper(componentModel= "spring")
public interface EventMapper {

   Event toEntity(EventRequest request);

   EventResponse toDto (Event event);

   void updateEvent(@MappingTarget Event event,EventRequest request);



}

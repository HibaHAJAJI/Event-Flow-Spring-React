package EventFlow.repository;

import EventFlow.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;


public interface EventRepository extends JpaRepository<Event,Long> {
}

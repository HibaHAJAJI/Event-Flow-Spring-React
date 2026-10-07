package EventFlow.dto;


import EventFlow.enums.StatutEvent;
import lombok.Data;

import java.time.LocalDateTime;


@Data
public class EventResponse {

    private Long id;

    private String titre;

    private String description;

    private String lieu;

    private LocalDateTime dateDebut;

    private LocalDateTime dateFin;

    private StatutEvent statut;
}


import { Button } from "@mui/material";

function EventItem({ event, onEdit, onDelete }) {
  return (
    <div>
      <h3>{event.titre}</h3>
      <p>ID : {event.id}</p>
      <p>Description : {event.description}</p>
      <p>Lieu : {event.lieu}</p>
      <p>Date début : {event.dateDebut}</p>
      <p>Date fin : {event.dateFin}</p>
      <p>Statut : {event.statut}</p>

      <Button onClick={() => onEdit(event)}>
        Modifier
      </Button>

      <Button color="error" onClick={() => onDelete(event.id)}>
        Supprimer
      </Button>
    </div>
  );
}

export default EventItem;

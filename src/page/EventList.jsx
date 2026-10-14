
import EventItem from "./EventItem.jsx";

function EventList({ events, onEdit, onDelete }) {
  return (
    <div>
      <h2 className="mb-4 text-2xl font-bold">
        Liste des événements
      </h2>

      {events.length === 0 ? (
        <p>Aucun événement à afficher.</p>
      ) : (
        events.map((event) => (
          <EventItem
            key={event.id}
            event={event}
            onEdit={onEdit}
            onDelete={onDelete}
          />
        ))
      )}
    </div>
  );
}

export default EventList;
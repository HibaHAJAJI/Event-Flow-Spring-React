import { useEffect } from "react";
import { useForm } from "react-hook-form";
import { yupResolver } from "@hookform/resolvers/yup";
import { TextField, Button, Stack, MenuItem } from "@mui/material";
import eventSchema from "../validation/eventSchema";

const emptyEvent = {
  titre: "",
  description: "",
  lieu: "",
  dateDebut: "",
  dateFin: "",
  statut: "PLANNED",
};

function EventForm({ initialEvent, onSave }) {
  const {
    register,
    handleSubmit,
    reset,
    formState: { errors },
  } = useForm({
    resolver: yupResolver(eventSchema),
    defaultValues: emptyEvent,
  });

useEffect(() => {
  if (initialEvent) {
    reset(initialEvent);
  } else {
    reset(emptyEvent);
  }
}, [initialEvent,reset]);

  const handleSave = async (data) => {
    await onSave(data);
    reset(emptyEvent);
  };

  return (
    <Stack
      component="form"
      onSubmit={handleSubmit(handleSave)}
      spacing={2}
      sx={{ maxWidth: 400, mt: 2, mb: 2 }}
    >
      <h3>
        {initialEvent ? "Modifier l'événement" : "Ajouter un événement"}
      </h3>

      <TextField
        label="Titre"
        {...register("titre")}
        error={!!errors.titre}
        helperText={errors.titre?.message}
      />

      <TextField
        label="Description"
        {...register("description")}
        error={!!errors.description}
        helperText={errors.description?.message}
      />

      <TextField
        label="Lieu"
        {...register("lieu")}
        error={!!errors.lieu}
        helperText={errors.lieu?.message}
      />

      <TextField
        label="Date début"
        type="datetime-local"
        {...register("dateDebut")}
        slotProps={{ inputLabel: { shrink: true } }}
        error={!!errors.dateDebut}
        helperText={errors.dateDebut?.message}
      />

      <TextField
        label="Date fin"
        type="datetime-local"
        {...register("dateFin")}
        slotProps={{ inputLabel: { shrink: true } }}
        error={!!errors.dateFin}
        helperText={errors.dateFin?.message}
      />

      <TextField
        select
        label="Statut"
        defaultValue="PLANNED"
        {...register("statut")}
        error={!!errors.statut}
        helperText={errors.statut?.message}
      >
        <MenuItem value="PLANNED">PLANNED</MenuItem>
        <MenuItem value="ONGOING">ONGOING</MenuItem>
        <MenuItem value="COMPLETED">COMPLETED</MenuItem>
        <MenuItem value="CANCELLED">CANCELLED</MenuItem>
      </TextField>

      <Button type="submit" variant="contained">
        {initialEvent ? "Modifier" : "Ajouter"}
      </Button>
    </Stack>
  );
}

export default EventForm;

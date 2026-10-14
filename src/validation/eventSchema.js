import * as yup from "yup";

const eventSchema = yup.object({
  titre: yup
    .string()
    .required("Le titre est obligatoire")
    .min(3, "Le titre doit contenir au moins 3 caractères"),

  description: yup
    .string(),

  lieu: yup
    .string(),

  dateDebut: yup
    .string()
    .required("La date de début est obligatoire"),

  dateFin: yup
    .string()
    .required("La date de fin est obligatoire"),

  statut: yup
    .string()
    .oneOf(
      ["PLANNED", "ONGOING", "COMPLETED", "CANCELLED"],
      "Statut invalide"
    )
    .required("Le statut est obligatoire"),
});

export default eventSchema;

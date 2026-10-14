import axios from "axios";

const api_url = "http://localhost:8080/api/events";

const EventService = {
  getAllEvents: async () => {
    return await axios.get(api_url);
  },

  getEventById: async (id) => {
    return await axios.get(`${api_url}/${id}`);
  },

  addEvent: async (event) => {
    return await axios.post(api_url, event);
  },

  updateEvent: async (id, event) => {
    return await axios.put(`${api_url}/${id}`, event);
  },

  deleteEvent: async (id) => {
    return await axios.delete(`${api_url}/${id}`);
  },

};

export default EventService;

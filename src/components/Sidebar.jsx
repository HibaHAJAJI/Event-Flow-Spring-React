import { Drawer, List, ListItemButton, ListItemIcon, ListItemText } from "@mui/material";
import EventNoteIcon from "@mui/icons-material/EventNote";
import AddIcon from "@mui/icons-material/Add";
import EditIcon from "@mui/icons-material/Edit";

function Sidebar() {
  return (
    <Drawer
      variant="permanent"
      sx={{
        width: 200,
        flexShrink: 0,
        "& .MuiDrawer-paper": {
          width: 200,
          top: 64,
          height: "calc(100% - 64px)",
          boxSizing: "border-box",
          bgcolor: "white",
          borderRight: "1px solid #DDD6FE",
        },
      }}
    >
      <List sx={{ p: 1.5 }}>
        <ListItemButton sx={{ borderRadius: 2, mb: 1 }}>
          <ListItemIcon sx={{ minWidth: 40, color: "#7C3AED" }}>
            <EventNoteIcon />
          </ListItemIcon>
          <ListItemText primary="List Events" />
        </ListItemButton>

        <ListItemButton sx={{ borderRadius: 2, mb: 1 }}>
          <ListItemIcon sx={{ minWidth: 40, color: "#7C3AED" }}>
            <AddIcon />
          </ListItemIcon>
          <ListItemText primary="Add Event" />
        </ListItemButton>

        <ListItemButton sx={{ borderRadius: 2, mb: 1 }}>
          <ListItemIcon sx={{ minWidth: 40, color: "#7C3AED" }}>
            <EditIcon />
          </ListItemIcon>
          <ListItemText primary="Edit Event" />
        </ListItemButton>
      </List>
    </Drawer>
  );
}

export default Sidebar;
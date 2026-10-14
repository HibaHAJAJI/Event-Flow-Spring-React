import { AppBar, Toolbar, Typography } from "@mui/material";

function Navbar() {
  return (
    <AppBar
      position="fixed"
      elevation={0}
      sx={{
        bgcolor: "#EDE9FE",
        borderBottom: "1px solid #DDD6FE",
      }}
    >
      <Toolbar>
        <Typography
          variant="h5"
          sx={{ fontWeight: "bold", letterSpacing: 1 }}
        >
          <span style={{ color: "#7346c2" }}>Event</span>
          <span style={{ color: "#172554" }}>Flow</span>
        </Typography>
      </Toolbar>
    </AppBar>
  );
}

export default Navbar;
public class Driver {
    private final String driverId;
    private Location currentLocation;
    private boolean available;

    public Driver(String driverId, Location location) {
        this.driverId = driverId;
        this.currentLocation = location;
        this.available = true;
    }

    public String getDriverId() { return driverId; }
    public Location getCurrentLocation() { return currentLocation; }
    public boolean isAvailable() { return available; }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

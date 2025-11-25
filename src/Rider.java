public class Rider {
    private final String riderId;
    private Location currentLocation;
    private String emergencyContact;
    public Rider(String riderId, Location location) {
        this.riderId = riderId;
        this.currentLocation = location;
        this.emergencyContact = "Not Set";
    }

    public String getRiderId() {
        return riderId;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }
    public void setEmergencyContact(String contact) {
        this.emergencyContact = contact;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }
}

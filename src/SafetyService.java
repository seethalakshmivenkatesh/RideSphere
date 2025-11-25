public class SafetyService {

    public void triggerSOS(Rider rider, Trip trip) {
        System.out.println("SOS Triggered by Rider: " + rider.getRiderId());
        System.out.println("Notifying Emergency Contact: " + rider.getEmergencyContact());
        System.out.println("Sending current driver & trip details...");
        System.out.println("Driver: " + trip.getDriver().getDriverId());
        System.out.println("Location: " + rider.getCurrentLocation());
        System.out.println("Emergency team dispatched!");
    }

    public void shareLiveLocation(Rider rider) {
        System.out.println("Live Location shared with emergency contact: "
                + rider.getEmergencyContact());
    }
}

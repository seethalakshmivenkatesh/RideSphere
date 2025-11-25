public class Trip {
    private final String tripId;
    private final Rider rider;
    private final Driver driver;
    private final double price;
    private final SafetyService safetyService = new SafetyService();
    public Trip(String tripId, Rider rider, Driver driver, double price) {
        this.tripId = tripId;
        this.rider = rider;
        this.driver = driver;
        this.price = price;

        this.driver.setAvailable(false);
    }

    public String getTripId() {
        return tripId;
    }

    public Rider getRider() {
        return rider;
    }

    public Driver getDriver() {
        return driver;
    }

    // SAFETY ACTIONS
    public void triggerSOS() {
        safetyService.triggerSOS(rider, this);
    }

    public void shareLiveLocation() {
        safetyService.shareLiveLocation(rider);
    }

    public void endTrip() {
        driver.setAvailable(true);
        System.out.println("Trip ended. Driver is now available.");
    }
}

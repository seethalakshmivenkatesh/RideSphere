import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Driver> drivers = new ArrayList<>();
        drivers.add(new Driver("D1", new Location(10, 20)));
        drivers.add(new Driver("D2", new Location(15, 25)));
        drivers.add(new Driver("D3", new Location(14, 18)));


        Rider rider = new Rider("R1", new Location(11, 22));
        rider.setEmergencyContact("9876543210");
        RideService rideService = new RideService(
                new DriverMatchingService(),
                new PricingService()
        );

        Trip trip = rideService.bookRide(rider, drivers);

        if (trip != null) {
            System.out.println("Trip booked successfully! Trip ID: " + trip.getTripId());
            // Safety actions
            trip.shareLiveLocation();
            trip.triggerSOS();
            trip.endTrip();
        }
    }
}

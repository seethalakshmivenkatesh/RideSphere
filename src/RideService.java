import java.util.List;

public class RideService {

    private final DriverMatchingService matchingService;
    private final PricingService pricingService; // YOU ALREADY HAVE THIS

    public RideService(DriverMatchingService matchingService,
                       PricingService pricingService) {
        this.matchingService = matchingService;
        this.pricingService = pricingService;
    }

    public Trip bookRide(Rider rider, List<Driver> drivers) {

        Driver driver = matchingService.findNearestDriver(rider, drivers);
        if (driver == null) {
            System.out.println("No drivers available.");
            return null;
        }

        double price = pricingService.calculatePrice(
                rider.getCurrentLocation(),
                driver.getCurrentLocation()
        );

        return new Trip("T-" + System.currentTimeMillis(), rider, driver, price);
    }
}

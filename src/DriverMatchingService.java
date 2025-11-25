import java.util.List;

public class DriverMatchingService {

    public Driver findNearestDriver(Rider rider, List<Driver> drivers) {
        Driver nearest = null;
        double bestDistance = Double.MAX_VALUE;

        for (Driver driver : drivers) {
            if (!driver.isAvailable()) continue;

            double d = rider.getCurrentLocation().distanceTo(driver.getCurrentLocation());
            if (d < bestDistance) {
                bestDistance = d;
                nearest = driver;
            }
        }
        return nearest;
    }
}

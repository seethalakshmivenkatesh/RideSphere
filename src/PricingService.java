public class PricingService {


    public double calculatePrice(Location riderLoc, Location driverLoc) {
        double distance = riderLoc.distanceTo(driverLoc);
        double baseFare = 50;
        double perKmRate = 10;

        return baseFare + (distance * perKmRate);
    }
}

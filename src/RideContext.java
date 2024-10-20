public class RideContext {
    private FareStrategy fareStrategy;

    public void setFareStrategy(FareStrategy fareStrategy) {
        this.fareStrategy = fareStrategy;
    }

    public double calculateFare(double distance, double duration) {
        if (distance <= 0 || duration < 0) {
            throw new IllegalArgumentException("Invalid input: distance and duration must be positive.");
        }
        return fareStrategy.calculateFare(distance, duration);
    }

    public void selectFareStrategy(String rideType, boolean isPeakHour) {
        switch (rideType.toLowerCase()) {
            case "premium":
                fareStrategy = new PremiumFareStrategy();
                break;
            case "discount":
                fareStrategy = new DiscountFareStrategy();
                break;
            case "regular":
                fareStrategy = new RegularFareStrategy();
                break;
            default:
                fareStrategy = isPeakHour ? new SurgeFareStrategy() : new RegularFareStrategy();
                break;
        }
    }
}

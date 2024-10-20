public class DiscountFareStrategy implements FareStrategy {
    private static final double COST_PER_KM = 0.75;
    private static final double COST_PER_MINUTE = 0.15;

    @Override
    public double calculateFare(double distance, double duration) {
        return (COST_PER_KM * distance) + (COST_PER_MINUTE * duration);
    }
}

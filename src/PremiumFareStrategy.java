public class PremiumFareStrategy implements FareStrategy {
    private static final double COST_PER_KM = 2.0;
    private static final double COST_PER_MINUTE = 0.50;

    @Override
    public double calculateFare(double distance, double duration) {
        return (COST_PER_KM * distance) + (COST_PER_MINUTE * duration);
    }
}


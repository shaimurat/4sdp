//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            RideContext ride = new RideContext();

            ride.selectFareStrategy("regular", false);
            double regularFare = ride.calculateFare(10, 15);
            System.out.println("Regular Fare: $" + regularFare);

            ride.selectFareStrategy("premium", false);
            double premiumFare = ride.calculateFare(10, 15);
            System.out.println("Premium Fare: $" + premiumFare);

            ride.selectFareStrategy("discount", false);
            double discountFare = ride.calculateFare(10, 15);
            System.out.println("Discount Fare: $" + discountFare);

            ride.selectFareStrategy("regular", true);
            double surgeFare = ride.calculateFare(10, 15);
            System.out.println("Surge Fare: $" + surgeFare);

            try {
                double invalidFare = ride.calculateFare(-10, 15);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }



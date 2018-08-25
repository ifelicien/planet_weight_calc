import java.util.Scanner;

public class Mars {
    public static double myMarsCalculator() {

        double myTotal = 0;
        double Mars_Weight = .38;

        System.out.println("Enter your weight: ");

        Scanner scanner = new Scanner(System.in);
//        FIXME: brakes when user enters fractional number
        double scan = scanner.nextDouble();

        myTotal = Mars_Weight * scan;

        System.out.println("your weight on the Mars is: " + myTotal + "Lbs");

        return myTotal;

    }
}

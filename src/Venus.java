import java.util.Scanner;

public class Venus {
    public static double myVenusCalculator() {

        double myTotal = 0;
        double Venus_Weight = .90;

        System.out.println("Enter your weight");

        Scanner scanner = new Scanner(System.in);
        double scan = scanner.nextDouble();

        myTotal = Venus_Weight * scan;

        System.out.println("your weight on the Venus is: " + myTotal + "Lbs");

        return 0;
    }
}

import java.util.Scanner;

public class Uranus {
    public static double myUranusCalculator() {

        double myTotal = 0;
        double Venus_Weight = .89;

        System.out.println("Enter your weight");

        Scanner scanner = new Scanner(System.in);
        double scan = scanner.nextDouble();

        myTotal = Venus_Weight * scan;

        System.out.println("your weight on the Uranus is: " + myTotal + "Lbs");

        return 0;
    }
}

import java.util.Scanner;

public class Saturn {
    public static double mySaturnCalculator() {

        double myTotal = 0;
        double Venus_Weight = .9;

        System.out.println("Enter your weight");

        Scanner scanner = new Scanner(System.in);
        double scan = scanner.nextDouble();

        myTotal = Venus_Weight * scan;

        System.out.println("your weight on the Saturn is: " + myTotal + "Lbs");

        return 0;
    }
}

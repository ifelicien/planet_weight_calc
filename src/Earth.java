import java.util.Scanner;

public class Earth {
    public static double myEarthCalculator() {

        double myTotal = 0;
        double Earth_Weight = 1;

        System.out.println("Enter your weight: ");

        Scanner scanner = new Scanner(System.in);
        double scan = scanner.nextDouble();

        myTotal = Earth_Weight * scan;

        System.out.println("Your weight on Earth is: " + myTotal + "LBs");

        return 0;
    }
}

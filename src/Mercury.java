import java.util.Scanner;

public class Mercury {
    public static double myMercuryCalculator() {

        double myTotal = 0;
        double Mercury_Weight = .38;

        System.out.println("Enter your weight: ");

        Scanner scanner = new Scanner(System.in);
        double scan = scanner.nextDouble();

        myTotal = Mercury_Weight * scan;

        System.out.println("Your weight on Mercury is: " + myTotal + "LBs");

        return 0;
    }
}
// add double for weight input
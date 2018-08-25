import java.util.Scanner;

public class Jupiter {
    public static double myJupiterCalculator() {

        double myTotal = 0;
        double Venus_Weight = 2.36;

        System.out.println("Enter your weight");

        Scanner scanner = new Scanner(System.in);
        double scan = scanner.nextDouble();

        myTotal = Venus_Weight * scan;

        System.out.println("your weight on the Jupiter is: " + myTotal + "Lbs");

        return 0;
    }
}

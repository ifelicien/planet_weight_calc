import java.util.Scanner;

public class Neptune {
    public static double myNeptuneCalculator() {

        double myTotal = 0;
        double Venus_Weight = 1.13;

        System.out.println("Enter your weight");

        Scanner scanner = new Scanner(System.in);
        double scan = scanner.nextDouble();

        myTotal = Venus_Weight * scan;

        System.out.println("your weight on the Neptune is: " + myTotal + "Lbs");

        return 0;
    }
}

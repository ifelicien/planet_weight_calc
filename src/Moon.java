import java.util.Scanner;

public class Moon {
    public static double myMoonCalculator() {

        double myTotal = 0;
        double Moon_Weight = .17;

        System.out.println("Enter your weight");

        Scanner scanner = new Scanner(System.in);
        double scan = scanner.nextDouble();

        myTotal = Moon_Weight * scan;

        System.out.println("your weight on the Moon is: " + myTotal + "Lbs");

        return 0;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        TODO: format output to match expect appearance to be delivered to the user.
        System.out.println("Welcome! \nPress the corresponding planets number\n1\tMercury \n2\tVenus \n3\tEarth \n4\tMars \n5\tJupiter \n6\tSaturn" +
                "\n7\tUranus \n8\tNeptune \n9\tMoon");

        Scanner scanner = new Scanner(System.in);
//        TODO: handle all input types that are not Integers. Send to default behavior.
        int sc = scanner.nextInt();

//        TODO: truncate returning values to two decimal places.
//        TODO: handle all input types that are not double for the user weight.
//        TODO: remove redundant code. Use polymorphism for the Calculator method.
        switch (sc) {
            case 1:
                Mercury.myMercuryCalculator();
                break;

            case 2:
                Venus.myVenusCalculator();
                break;

            case 3:
                Earth.myEarthCalculator();
                break;

            case 4:
                Mars.myMarsCalculator();
                break;

            case 5:
                Jupiter.myJupiterCalculator();
                break;

            case 6:
                Saturn.mySaturnCalculator();
                break;

            case 7:
                Uranus.myUranusCalculator();
                break;

            case 8:
                Neptune.myNeptuneCalculator();
                break;

            case 9:
                Moon.myMoonCalculator();
                break;

//                TODO: upon invalid input loop user back to welcome menu.
            default:
                System.out.println("invalid option ");

        }

    }
}
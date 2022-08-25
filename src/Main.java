import java.util.Scanner;

public class Main {
    public static double toMilesPerHour(double kilometersPerHour) {
        double milesPerHour = kilometersPerHour / 1.609;

        if (kilometersPerHour < 0) {
            milesPerHour = -1;
        }

        return milesPerHour;
    }

    public static double toKilometersPerHour(double milesPerHour) {
        double kilometersPerHour = milesPerHour * 1.609;

        return kilometersPerHour;
    }

    public static void main(String[] args) {
        Scanner conversion = new Scanner(System.in);
        System.out.println("Type (km-mi) to convert kilometers to miles. Type (mi-km) to convert miles to kilometers.");

        if (conversion.hasNext("km-mi")) {
            Scanner value = new Scanner(System.in);
            System.out.println("Type km/h in decimal format.");

            double kilometersPerHour = Double.parseDouble(value.next());
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");

        } else if (conversion.hasNext("mi-km")) {
            Scanner value = new Scanner(System.in);
            System.out.println("Type mi/h in decimal format.");

            double milesPerHour = Double.parseDouble(value.next());
            System.out.println(milesPerHour + " mi/h = " + toKilometersPerHour(milesPerHour) + " km/h");
        }
    }
}
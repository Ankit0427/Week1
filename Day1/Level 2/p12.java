import java.util.*;

public class p12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the weight in pounds: ");
        double pounds = scanner.nextDouble();

        double kilograms = pounds / 2.2;

        System.out.println("The weight of the person in pounds is " + pounds + " and in kilograms is " + kilograms + ".");

        scanner.close();
    }
}

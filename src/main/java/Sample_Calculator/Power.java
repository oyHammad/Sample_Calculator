package Sample_Calculator;

import java.util.Scanner;

public class Power {
    public void power() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Base Number");
        double baseNumber = scanner.nextDouble();
        System.out.println("Enter the exponent");
        double exponent = scanner.nextDouble();
        double result = Math.pow(baseNumber, exponent);
        System.out.println(result);
    }
}

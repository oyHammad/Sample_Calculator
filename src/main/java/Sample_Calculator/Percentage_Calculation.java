package Sample_Calculator;

import java.util.Scanner;

public class Percentage_Calculation {
    public void Percentage(){
        final int percentageEquivalent =100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter the Second Number");
        double secondNumber = scanner.nextDouble();
        double result = firstNumber*secondNumber/percentageEquivalent;
        System.out.println(result);
    }
}

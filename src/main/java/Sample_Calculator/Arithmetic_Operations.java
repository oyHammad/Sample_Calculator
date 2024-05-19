package Sample_Calculator;

import java.util.Scanner;

public class Arithmetic_Operations {
    public void Addition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter the Second Number");
        double secondNumber = scanner.nextDouble();
        double result = firstNumber + secondNumber;
        System.out.println(result);

    }
    public void Subtraction () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter the Second Number");
        double secondNumber = scanner.nextDouble();
        double result = firstNumber - secondNumber;
        System.out.println(result);

    }
    public void Multiplication  () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter the Second Number");
        double secondNumber = scanner.nextDouble();
        double result = firstNumber * secondNumber;
        System.out.println(result);

    }
    public void Division   () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter the Second Number");
        double secondNumber = scanner.nextDouble();
        double result = firstNumber / secondNumber;
        System.out.println(result);

    }
}

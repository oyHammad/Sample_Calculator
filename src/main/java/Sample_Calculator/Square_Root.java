package Sample_Calculator;

import java.util.Scanner;

public class Square_Root {
    public void squareRoot(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number");
        double firstNumber =scanner.nextDouble();
        double result = Math.sqrt(firstNumber);
        System.out.println(result);
    }


}

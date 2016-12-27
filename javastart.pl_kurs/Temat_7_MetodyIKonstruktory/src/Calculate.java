import java.util.Scanner;

/**
 * Created by krzychol99 on 2016-12-27.
 */
public class Calculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("FIRST NUMBER: ");
        double a = input.nextDouble();
        System.out.println("SECOND NUMBER: ");
        double b = input.nextDouble();
        input.nextLine();
        input.close();

        Calculator calculator = new Calculator();
        calculator.add(a,b);
        calculator.substract(a,b);

        System.out.println("FIRST NUMBER: " + a + " SECOND NUMBER: " + b);
        System.out.println();
        System.out.println(a + " + " + b + " = " + calculator.add(a, b));
        System.out.println(a + " - " + b + " = " + calculator.substract(a, b));
        System.out.println(a + " * " + b + " = " + calculator.multiply(a, b));

        if(b != 0) {
            System.out.println(a + " + " + b + " = " + calculator.divide(a, b));
        } else {
            System.out.println("Wrong data, you can't divide by 0!");
        }



    }
}

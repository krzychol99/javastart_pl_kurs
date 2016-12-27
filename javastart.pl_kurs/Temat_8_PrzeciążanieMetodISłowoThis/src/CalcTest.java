import java.util.Scanner;

/**
 * Created by krzychol99 on 2016-12-27.
 */
public class CalcTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter values A, B and C: ");
        System.out.println("Enter value A: ");
        double a = input.nextDouble();
        System.out.println("Enter value B: ");
        double b = input.nextDouble();
        System.out.println("Enter value C: ");
        double c = input.nextDouble();
        input.nextLine();
        input.close();

        System.out.println("Value A: " + a + ";\tValue B: " + b + ";\tValue C: " + c);
        System.out.println("A + B = " + calculator.add(a,b));
        System.out.println("A + B + C = " + calculator.add(a,b,c));
        System.out.println("A + B = " + calculator.substract(a,b));
        System.out.println("A + B + C = " + calculator.substract(a,b,c));

    }
}

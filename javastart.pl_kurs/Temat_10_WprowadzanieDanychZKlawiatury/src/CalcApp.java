import java.util.Locale;
import java.util.Scanner;

/**
 * Created by krzychol99 on 2016-12-30.
 */
public class CalcApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double a = scanner.nextDouble();
        scanner.nextLine();
        String operator = scanner.nextLine();
        scanner.nextLine();
        double b = scanner.nextDouble();

        Calculator calculator = new Calculator();
        double result = calculator.calculate(a,b,operator);
        System.out.println(a + operator + b + " = " + result);
        scanner.close();
    }
}

import java.util.Random;

/**
 * Created by krzychol99 on 2016-12-27.
 */
public class NumberChecker{
    public static void main(String[] args) {
        Random random = new Random();
        int firsNum = random.nextInt(10);
        int secondNum = random.nextInt(10);

        System.out.println("First number: " + firsNum + "; Second number: " + secondNum);
        boolean result = firsNum > secondNum;

        System.out.println("First number is bigger than second number? " + result);

        result = (firsNum * 2) > secondNum;
        System.out.println("First number multiplied by 2 is bigger than second number? " + result);

        result = (secondNum < firsNum + 3 && secondNum > firsNum -2);
        System.out.println("Second number is smaller than first number plus 3 and second number is bigger than first number minus 2? " + result);

        result = (firsNum * secondNum)%2 == 0;
        System.out.println("Result of first number multiplied by second number is even");
    }
}

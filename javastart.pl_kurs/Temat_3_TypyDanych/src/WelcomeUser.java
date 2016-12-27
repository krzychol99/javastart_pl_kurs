/**
 * Created by krzychol99 on 2016-12-27.
 */
public class WelcomeUser {
    public static void main(String[] args) {
        String userName = "Krzysztof";
        int age = 30;
        char nameFirstLetter = 'K';
        boolean answer = true;

        System.out.println("Hello User!");
        System.out.println("What is your name?");
        System.out.println("My name is " + userName);
        System.out.println("How old are you?");
        System.out.println("I'm " + age + "rd years old");
        System.out.println("First letter of your name is " + nameFirstLetter + "Is it true?" + " Yes, it's " + answer);
    }
}

package ie.atu.week2;

import java.util.Scanner;

public class CalC {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        double firstNum = scan1.nextDouble();
        System.out.println("You entered: " + firstNum);

        System.out.println("Please enter another number: ");
        double secondNum = scan1.nextDouble();
        System.out.println("You entered: " + secondNum);

        System.out.println("What would you like to do? (add, subtract, multiply, divide)");
        String operation = scan1.next();

        double result = 0; 

        switch (operation) {
            case "add":
                result = firstNum + secondNum;
                System.out.println("The result is: " + result);
                break;

            case "subtract":
                result = firstNum - secondNum;
                System.out.println("The result is: " + result);
                break;

            case "multiply":
                result = firstNum * secondNum;
                System.out.println("The result is: " + result);
                break;

            case "divide":
                result = firstNum / SecondNum;
                System.out.println("The result is: " + result);
                break;

            default:
                System.out.println("That operation is not recognized.");
                break;
        }

        scan1.close();
    }
}

package ie.atu.week2;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CalC {
    public static void main(String[] args) {
            Scanner scan1  = new Scanner(System.in);
            System.out.println("Please enter a Number: ");
            double firstNum = scan1.nextDouble();
            System.out.println("You entered: " + firstNum);

        System.out.println("Please enter a Number: ");
        double secondNum = scan1.nextDouble();
        System.out.println("You entered: " + secondNum);

        double sum = firstNum + secondNum;
        System.out.println("The sum is: " + sum);
        }
    }
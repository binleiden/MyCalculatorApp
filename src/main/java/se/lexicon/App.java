package se.lexicon;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //Display input options
        System.out.println("My Calculator App");

        //Addition
        System.out.println("1: Addition");

        //Subtraction
        System.out.println("2: Subtraction");

        //Multiplication
        System.out.println("3: Multiplication");

        //Division
        System.out.println("4: Division");

        //Exit
        System.out.println("5: Exit");

        //User select which method to use for calculation of input nr1 and nr2

        //Enter number1 Scanner input store in value nr1
        Scanner firstNumber = new Scanner(System.in);
        System.out.println("Enter first nr");
        int number1 = firstNumber.nextInt();
        //Enter number2 Scanner input store in value nr2
        Scanner secondNumber = new Scanner(System.in);
        System.out.println("Enter second nr");
        int number2 = secondNumber.nextInt();
        //Calculate and display result and then go back to main menu
        int result;

    }
}

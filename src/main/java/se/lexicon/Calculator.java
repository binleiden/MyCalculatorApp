package se.lexicon;

import java.util.Scanner;

/**
 * Hello world!
 */
public class Calculator {
    public static void main(String[] args) {
        //Enter number1 Scanner input store in value nr1
        //Enter number2 Scanner input store in value nr2
        //Calculate and display result and then go back to main menu
        //int result;
        //User select which method to use for calculation of input nr1 and nr2
        boolean startLoop = true;
        while (startLoop){
            Calculator.displayMenu();
            Scanner choice = new Scanner(System.in);
            int userChoice = choice.nextInt();
            Scanner firstNumber = new Scanner(System.in);
            System.out.println("Enter first nr");
            int number1 = firstNumber.nextInt();
            Scanner secondNumber = new Scanner(System.in);
            System.out.println("Enter second nr");
            int number2 = secondNumber.nextInt();
            switch (userChoice){
                case 1:
                    Object addition = number1 + number2;
                    System.out.println(addition);
                    break;
                case 2:
                    Object subtraction = number1 - number2;
                    System.out.println(subtraction);
                    break;
                case 3:
                    Object multiplication = number1 * number2;
                    System.out.println(multiplication);
                    break;
                case 4:
                    Object division = number1 / number2;
                    System.out.println(division);
                    break;
                case 5:
                    startLoop = false;
                    break;
                default:
                    System.out.println("Select a number between 1 and 5");
            }
        }

    }
    //Display input options
    public static void displayMenu(){
        System.out.println("My Calculator App");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Exit");
    }
}

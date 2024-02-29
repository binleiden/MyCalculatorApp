package se.lexicon;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        boolean startLoop;
        do {
            displayMenu();
            int userChoice = getUserChoice();
            if (userChoice >= 1 && userChoice <= 4) {
                int number1 = getNumber("Enter first number: ");
                int number2 = getNumber("Enter second number: ");
                switch (userChoice) {
                    case 1:
                        performOperation(number1, number2, "addition");
                        break;
                    case 2:
                        performOperation(number1, number2, "subtraction");
                        break;
                    case 3:
                        performOperation(number1, number2, "multiplication");
                        break;
                    case 4:
                        if (number2 != 0) {
                            performOperation(number1, number2, "division");
                        } else {
                            System.out.println("Error: Division by zero!");
                        }
                        break;
                }
                startLoop = true;
            } else if (userChoice == 5) {
                startLoop = false;
            } else {
                System.out.println("Select a number between 1 and 5");
                startLoop = true;
            }
        } while (startLoop);
    }

    private static void performOperation(int number1, int number2, String operation) {
        int result = 0;
        switch (operation) {
            case "addition":
                result = number1 + number2;
                break;
            case "subtraction":
                result = number1 - number2;
                break;
            case "multiplication":
                result = number1 * number2;
                break;
            case "division":
                result = number1 / number2;
                break;
        }
        System.out.println("Result of " + operation + " is: " + result);
    }

    private static int getNumber(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }

    private static int getUserChoice() {
        return getNumber("Enter your choice: ");
    }

    private static void displayMenu() {
        System.out.println("My Calculator App");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Exit");
    }
}

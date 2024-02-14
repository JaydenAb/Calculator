// Jayden Abrams
// Calculator repo
// 2/14/2024




import java.util.Scanner;

public class Calculator{

    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

        
         System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();


        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter the number corresponding to your choice: ");
        int operationChoice = scanner.nextInt();

        
        double result;
        switch (operationChoice) {
            case 1:
                // Addition
                result = num1 + num2;
                System.out.println("You chose addition. The result is: " + result);
                break;
            case 2:
                // Subtraction
                result = num1 - num2;
                System.out.println("You chose subtraction. The result is: " + result);
                break;
            case 3:
                // Multiplication
                result = num1 * num2;
                System.out.println("You chose multiplication. The result is: " + result);
                break;
            case 4:
                // Division
                if (num2 != 0) {
                    result = (double) num1 / num2;
                    System.out.println("You chose division. The result is: " + result);
                } else {
                    System.out.println("Cannot divide by zero. Please enter a non-zero second number.");
                }
                break;
            default:
                System.out.println("Invalid operation choice. Please enter a number between 1 and 4.");
        }

        
        scanner.close();
    }
}
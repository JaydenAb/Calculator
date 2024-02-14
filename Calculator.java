import java.util.Scanner;

public class Calculator{

    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first whole number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second whole number: ");
        int num2 = scanner.nextInt();


        System.out.print("Choose an operation (1 for addition, 2 for subtraction): ");
        int operationChoice = scanner.nextInt();

        // Perform the selected operation
        int result;
        if (operationChoice == 1) {
            // Addition
            result = num1 + num2;
            System.out.println("You chose addition. The result is: " + result);
        } else if (operationChoice == 2) {
            // Subtraction
            result = num1 - num2;
            System.out.println("You chose subtraction. The result is: " + result);
        } else {
            System.out.println("Invalid operation choice. Please choose 1 for addition or 2 for subtraction.");
        }

        // Close the Scanner
        scanner.close();
    }
}
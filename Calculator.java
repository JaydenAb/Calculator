import java.util.Scanner;

public class Calculator{

    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first whole number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second whole number: ");
        int num2 = scanner.nextInt();


        int result = num1 + num2;
        System.out.println("The result of " + num1 + " + " + num2 + " is: " + result);

        scanner.close();
    }
}
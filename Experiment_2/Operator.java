import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0); 
        System.out.println("You entered: " + operator);
        System.out.println("Enter the value of a: ");
        int a =sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b =sc.nextInt();
        switch (operator) {
            case '+':
                int result = a + b;
                System.out.println("Result is : " + result);
                break;

            case '-':
                result = a - b;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = a * b;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            case '%':
                if (b != 0) {
                    result = a % b;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Error: Invalid operator.");
        }


        sc.close(); 
    }
}  





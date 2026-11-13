import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("This is a simple calculator.");
        System.out.println("It supports +, -, *, and /.");

        try (Scanner sc = new Scanner(System.in)) {
            char repeat = 'y';

            while (repeat == 'y') {
                System.out.println("enter the first number:");
                double num1 = sc.nextDouble();

                System.out.println("enter your operator +,-,*,/");
                char operator = sc.next().charAt(0);

                System.out.println("enter second number:");
                double num2 = sc.nextDouble();
                double result;

                switch (operator) {
                    case '+' -> result = num1 + num2;
                    case '-' -> result = num1 - num2;
                    case '*' -> result = num1 * num2;
                    case '/' -> {
                        if (num2 == 0) {
                            System.out.println("cannot divide by zero");
                            return;
                        }
                        result = num1 / num2;
                    }
                    default -> {
                        System.out.println("invalid operator");
                        return;
                    }
                }

                System.out.println("your result is " + num1 + " " + operator + " " + num2 + " = " + result);
                System.out.println("do you want to perform another calculation (y/n)");
                repeat = sc.next().charAt(0);
            }
        }

        System.out.println("exit");
    }
}

import java.util.Scanner;

public class JavaFundamentals {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int c = sc.nextInt();
            double d = sc.nextDouble();
            sc.nextLine();
            String sy = sc.nextLine();
            System.out.println(c + d);
            System.out.println("Input string: " + sy);
        }
    }
}
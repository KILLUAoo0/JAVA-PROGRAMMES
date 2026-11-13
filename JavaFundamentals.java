
import java.util.Scanner;

public class JavaFundamentals{
    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
        int c = sc.nextInt();
        double d= sc.nextDouble();
        String sy= sc.nextLine();
        System.out.println(c + d);
        sc.close();
    }
}
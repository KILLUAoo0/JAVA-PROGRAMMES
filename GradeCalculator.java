import java.util.Scanner;

public class GradeCalculator {
    public static void displayMenu() {
        System.out.println("-- student grad calculator --");
        System.out.println("please enter your marks");
    }

    public static void displayMarks(int engMarks, int mathsMarks, int phyMarks) {
        System.out.println("your Eng marks are " + engMarks);
        System.out.println("your Maths marks are " + mathsMarks);
        System.out.println("your physics marks are " + phyMarks);
    }

    public static double calculateAverage(int engMarks, int mathsMarks, int phyMarks) {
        int sum = engMarks + mathsMarks + phyMarks;
        return sum / 3.0;
    }

    public static void gradeCalculator(int engMarks, int mathsMarks, int phyMarks) {
        double average = calculateAverage(engMarks, mathsMarks, phyMarks);

        if (average >= 90) {
            System.out.println("Grade A");
        } else if (average >= 80) {
            System.out.println("Grade B");
        } else if (average >= 70) {
            System.out.println("Grade C");
        } else if (average >= 60) {
            System.out.println("Grade D");
        } else if (average >= 50) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade F");
            System.out.println("you have failed the exam");
        }
    }

    public static void main(String[] args) {
        displayMenu();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter your eng marks");
            int engMarks = sc.nextInt();

            System.out.println("enter your Maths marks");
            int mathsMarks = sc.nextInt();

            System.out.println("enter your phy marks");
            int phyMarks = sc.nextInt();

            displayMarks(engMarks, mathsMarks, phyMarks);
            System.out.println("your average marks are " + calculateAverage(engMarks, mathsMarks, phyMarks));
            gradeCalculator(engMarks, mathsMarks, phyMarks);
        }
    }
}


import java.util.Scanner;

public class StudentsMarksManager {

    public static void displayMenu() {
        System.out.println("-- This is a Student Marks Manager --");
    }

    public static int highestMarks(int[] arr) {
        int highest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            }
        }

        return highest;
    }

    public static int lowestMarks(int[] arr) {
        int lowest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < lowest) {
                lowest = arr[i];
            }
        }

        return lowest;
    }

    public static int totalMarks(int[] arr) {
        int total = 0;

        for (int mark : arr) {
            total += mark;
        }

        return total;
    }

    public static double averageMarks(int[] arr) {
        return (double) totalMarks(arr) / arr.length;
    }

    public static String calculateGrade(int marks) {
        if (marks >= 90) {
            return "Grade A";
        } else if (marks >= 80) {
            return "Grade B";
        } else if (marks >= 70) {
            return "Grade C";
        } else if (marks >= 60) {
            return "Grade D";
        } else if (marks >= 50) {
            return "Grade E";
        } else {
            return "Grade F - Failed";
        }
    }

    public static void highestgradeCalculator(int[] arr) {
        int highest = highestMarks(arr);
        System.out.println(calculateGrade(highest));
    }

    public static void lowestgradeCalculator(int[] arr) {
        int lowest = lowestMarks(arr);
        System.out.println(calculateGrade(lowest));
    }

    public static void main(String[] args) {
        displayMenu();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter the number of students:");

            int size = sc.nextInt();

            if (size <= 0) {
                System.out.println("Number of students must be greater than zero.");
                return;
            }

            int[] arr = new int[size];

            System.out.println("Please enter the marks for each student (0-100):");

            for (int i = 0; i < arr.length; i++) {
                int marks;

                do {
                    System.out.print("Student " + (i + 1) + ": ");
                    marks = sc.nextInt();

                    if (marks < 0 || marks > 100) {
                        System.out.println("Invalid marks! Enter marks between 0 and 100.");
                    }
                } while (marks < 0 || marks > 100);

                arr[i] = marks;
            }

            System.out.println("\n-- Student Marks --");

            for (int i = 0; i < arr.length; i++) {
                System.out.println("Marks of student " + (i + 1) + " = " + arr[i]);
            }

            int highest = highestMarks(arr);
            int lowest = lowestMarks(arr);

            System.out.println("\nHighest marks: " + highest);
            System.out.println("Lowest marks: " + lowest);
            System.out.println("Total marks: " + totalMarks(arr));
            System.out.printf("Average marks: %.2f%n", averageMarks(arr));

            System.out.println("\nGrade of highest marks scorer: " + calculateGrade(highest));
            System.out.println("Grade of lowest marks scorer: " + calculateGrade(lowest));
        }
    }
}

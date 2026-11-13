package javapractice;

import java.util.Scanner;

public class GradeCalculator {
     public static void displaymenu(){
        System.out.println("-- student grad calculator--");
        System.out.println("please enter your marks");
    }
    public static void displaymarks(int engmarks, int mathsmarks, int phymarks){
        System.out.println("your Eng marks are " + engmarks);
        System.out.println("your Maths marks are " + mathsmarks);
        System.out.println("your physics marks are " + phymarks);
    }
    public static double calculateaverage(int engmarks, int mathsmarks, int phymarks){
        int sum= engmarks+mathsmarks+phymarks;
        double average= sum/3.0;
        return average;

    }
    public static void gradecalculator(int engmarks, int mathsmarks, int phymarks){
        double average= calculateaverage(engmarks,mathsmarks,phymarks);
        if (average>=90){
            System.out.println("Grade A");
        } else if (average>=80){
            System.out.println("Grade B");
        } else if (average>=70){
            System.out.println("Grade C");
        } else if (average>=60){
            System.out.println("Grade D");
        } else if (average>=50){
            System.out.println("Grade E");
        }else {
            System.out.println("Grade F");
            System.out.println("you have failed the exam");
        }
    }
    public static void main(String[] args) {
        displaymenu();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your eng marks");
        int engmarks= sc.nextInt();
        System.out.println("enter your Maths marks");
        int mathsmarks= sc.nextInt();
        System.out.println("enter your phy marks");
        int phymarks = sc.nextInt();
        displaymarks(engmarks,mathsmarks,phymarks);
        System.out.println("your average marks are " +calculateaverage(engmarks, mathsmarks,phymarks));
        gradecalculator(engmarks, mathsmarks,phymarks);

    }
}

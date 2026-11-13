import java.util.Scanner;

public class StudentRecordManager {
    public static int size(Scanner sc){
        System.out.println("how many students do you want to record");
        int size= sc.nextInt();
        sc.nextLine();
        return size;

    }
    public static String[] inputnames(int size, Scanner sc){

        String[] names= new String[size];
        System.out.println("Enter names of students");
        for (int i = 0; i <size; i++) {
            names[i]=sc.nextLine();
        }
        return names;
    }
    public static int[] inputmarks(int size,Scanner sc){
        int[] marks= new int[size];
        System.out.println("Enter marks of students");
        for (int i = 0; i < size; i++) {
            marks[i]=sc.nextInt();
        }
        return marks;

    }
    public static void viewstudents(String[] names, int[] marks, int size ){
        System.out.println("Student-marks list");
        for (int i = 0; i < size; i++) {
            System.out.println(i+1 + ". " + names[i] + " - " + marks[i]);
        }
    }
    public static void searchstudent(String[] names, int[] marks, int size, Scanner sc){
        System.out.println("enter student name for details");
        String target= sc.next();
        boolean found=false;
        for (int i = 0; i < size; i++) {
            if(target.equals(names[i])){
                found= true;
                System.out.println(names[i] + " - " + marks[i]);
                break;
            }
        }
        if(!found){
            System.out.println("student not found");
        }
    }
    public static void sortstudents(String[] names, int[] marks, int size){
        for (int i = 1; i < size; i++) {
            int keyMark = marks[i];
            String keyName = names[i];
            int prev = i - 1;
            while (prev >= 0 && marks[prev] < keyMark) {
                marks[prev + 1] = marks[prev];
                names[prev + 1] = names[prev];
                prev--;
            }
            marks[prev + 1] = keyMark;
            names[prev + 1] = keyName;
        }
    }
    public static void main(String[] args) {
        System.out.println("this is a Student Record Manager");

        try (Scanner sc = new Scanner(System.in)) {
            int size = size(sc);
            String[] names = inputnames(size, sc);
            int[] marks = inputmarks(size, sc);
            viewstudents(names, marks, size);
            searchstudent(names, marks, size, sc);
            sortstudents(names, marks, size);
            viewstudents(names, marks, size);
        }
    }
}

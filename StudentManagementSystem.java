import java.util.ArrayList;
import java.util.Scanner;

class Student {

    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        System.out.print("How many students do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine();

            students.add(new Student(name, rollNo));
        }

        System.out.println("\nStudent Details:");

        for (Student s : students) {
            s.display();
            System.out.println();
        }

        sc.close();
    }}

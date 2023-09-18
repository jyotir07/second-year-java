import java.util.Scanner;

class Student {
    int rollno;
    String name;

    void insertRecord(int r, String n) {
        rollno = r;
        name = n;
    }

    void dispInfo() {
        System.out.println("Roll Number: " + rollno + "\nName: " + name);
    }
}

public class TestStudent {
    static Scanner scanner = new Scanner(System.in);
    static Student[] students = new Student[3];

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            students[i] = new Student();
            getInputAndInsertRecord(i);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Student " + (i + 1) + " Information:");
            students[i].dispInfo();
        }
    }

    static void getInputAndInsertRecord(int i) {
        System.out.println("Enter Roll Number for Student " + (i + 1) + ": ");
        int roll = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter Name for Student " + (i + 1) + ": ");
        String name = scanner.nextLine();
        students[i].insertRecord(roll, name);
    }
}

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int id;
    private double score;
    private String grade;

    public Student(String name, int id, double score) {
        this.name = name;
        this.id = id;
        this.score = score;
        this.grade = calculateGrade(score);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getScore() {
        return score;
    }

    public String getGrade() {
        return grade;
    }

    private String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Score: " + score + ", Grade: " + grade);
    }
}

 class GradeManagementSystem {
    private ArrayList<Student> students;

    public GradeManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(String name, int id, double score) {
        Student student = new Student(name, id, score);
        students.add(student);
    }

    public void displayAllStudents() {
        for (Student student : students) {
            student.displayInfo();
        }
    }

    public static void main(String[] args) {
        GradeManagementSystem system = new GradeManagementSystem();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Student Grade Management System!");

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter Student ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                System.out.print("Enter Student Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter Student Score: ");
                double score = scanner.nextDouble();

                system.addStudent(name, id, score);
                System.out.println("Student added successfully!");

            } else if (choice == 2) {
                system.displayAllStudents();

            } else if (choice == 3) {
                System.out.println("Exiting the system.");
                break;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
    }
}
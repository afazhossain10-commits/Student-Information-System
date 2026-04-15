import java.util.Scanner;

public class StudentInformationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n===== Student Information System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input! Enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    Student s = new Student(id, name, age, course);
                    manager.addStudent(s);
                    break;

                case 2:
                    manager.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = Integer.parseInt(sc.nextLine());

                    Student found = manager.searchStudent(searchId);
                    if (found != null) {
                        found.display();
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to update: ");
                    int updateId = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter new Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter new Age: ");
                    int newAge = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter new Course: ");
                    String newCourse = sc.nextLine();

                    manager.updateStudent(updateId, newName, newAge, newCourse);
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}

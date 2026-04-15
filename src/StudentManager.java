import java.util.*;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    
    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully!");
    }

    
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students) {
            s.display();
        }
    }

    
    public Student searchStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    
    public void updateStudent(int id, String name, int age, String course) {
        Student s = searchStudent(id);
        if (s != null) {
            s.setName(name);
            s.setAge(age);
            s.setCourse(course);
            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }
}

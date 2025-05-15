import java.util.*;

public class AcademicClass {
    private Teacher teacher;
    private ArrayList<Student> students;
    
    public AcademicClass(Teacher teacher) {
        this.teacher = teacher;
        students = new ArrayList<Student>();
    }
    
    public void addStudent(Student s) {
        students.add(s);
    }
    
    public void printInfo() {
        System.out.println("Teacher: " + teacher.getName() + " Subject: " + teacher.getSubject());
        System.out.println("Students:");
        for (Student s: students) {
            System.out.println(s.getName() + " " + s.getFavoriteNumber());
        }
    }
    
    public ArrayList<Student> studentsWithFaveNum(int n) {
        ArrayList<Student> result = new ArrayList<Student>();
        for (Student s: students) {
            if (s.getFavoriteNumber() == n) {
                result.add(s);
            }
        }
        return result;
    }
    
    public ArrayList<Student> studentsWithOddFave() {
        ArrayList<Student> result = new ArrayList<Student>();
        for (Student s: students) {
            if (s.getFavoriteNumber() % 2 == 1) {
                result.add(s);
            }
        }
        return result;
    }
}
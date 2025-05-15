import java.util.*;

public class TestAcademicClass {
    public static void main(String[] args) {
        AcademicClass aClass = new AcademicClass(new Teacher("Dr. Kessner", "Computer Science"));
        aClass.addStudent(new Student("Sally", 2));
        aClass.addStudent(new Student("Jasmine", 9));
        aClass.addStudent(new Student("Claire", 11));
        aClass.printInfo();
        
        ArrayList<Student> faveNumTwo = aClass.studentsWithFaveNum(2);
        System.out.println("Favorite number 2:");
        for (Student s: faveNumTwo) { System.out.println(s.getName()); }
        
        ArrayList<Student> faveNumOdd = aClass.studentsWithOddFave();
        System.out.println("Favorite number odd:");
        for (Student s: faveNumOdd) { System.out.println(s.getName()); } 
    }
}
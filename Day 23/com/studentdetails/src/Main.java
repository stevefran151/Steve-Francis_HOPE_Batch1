import java.sql.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws SQLException {
        StudentDAO dao = new StudentDAO();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = sc.next();
        System.out.print("Enter the mark of the Student: ");
        int marks = sc.nextInt();
        dao.addStudent(new Student(0, name, marks));
        // List<Student> students = dao.getAllStudents();
        // for(Student s: students){
        //     System.out.printf("%d %s %d", s.getId(),s.getName(),s.getMarks());
        // }
        sc.close();
        //dao.updateStudent(3, 60);
        // dao.deleteStudent(3);
        List<Student> students = dao.getAllStudents();
        for(Student s: students){
            System.out.printf("%d %s %d\n", s.getId(),s.getName(),s.getMarks());
        }
    }
    
}

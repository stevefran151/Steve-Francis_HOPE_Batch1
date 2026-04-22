import java.sql.*;
import java.util.*;

public class StudentDAO {
    public void addStudent(Student s) throws SQLException {
        String query = "INSERT INTO students (name,marks) VALUE (?,?)";
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, s.getName());
            ps.setInt(2, s.getMarks());
            ps.executeUpdate();
            connection.close();
            System.out.println("Student Added");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<Student> getAllStudents() throws SQLException {
        List<Student> list = new ArrayList<>();
        String query = "SELECT * FROM students";
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                list.add(new Student(res.getInt("id"), 
                res.getString("name"), 
                res.getInt("marks")));
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    public void updateStudent(int id,int newMarks) throws SQLException{
        String query = "UPDATE students SET marks = ? where id = ?";
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1,newMarks);
            ps.setInt(2, id);
            ps.executeUpdate();
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void deleteStudent(int id) throws SQLException{
        String query = "DELETE FROM students where id = ?";
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

package src;

import java.sql.*;

public class JDBCConnection {
    public static void main(String[] args) {
        try{
            final String URL="jdbc:mysql://localhost:3306/student_db";
            final String USERNAME="root";
            final String PASSWORD="";
            Connection connection=DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection is Succesful with DB");
            connection.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

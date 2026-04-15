import java.io.*;

class Student implements Serializable{
    String name;
    int id;
    public static String val="Hello";
    public Student(int id, String name){
        this.id=id;
        this.name=name;
    }
}
public class SerializationImplementation {
    public static void main(String[] args) {
         Student s1 = new Student(1, "steve");
        try {
            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.close();
            fos.close();
            System.out.println("Object serialized successfully!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

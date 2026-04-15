import java.io.*;

public class FileWriterImplementation{
    public static void main(String[] args) {
        try{
            FileWriter writer=new FileWriter("steve.txt");
            writer.write("hi im steve\ntoday's wednesday");
            writer.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
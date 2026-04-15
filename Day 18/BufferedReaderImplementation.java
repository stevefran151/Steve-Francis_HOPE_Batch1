import java.io.*;
public class BufferedReaderImplementation {
    public static void main(String[] args) {
        try{
            BufferedReader reader=new BufferedReader(new FileReader("steve.txt"));
            while(reader.ready()){
                System.out.println(reader.readLine());
            }
            reader.close();
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}

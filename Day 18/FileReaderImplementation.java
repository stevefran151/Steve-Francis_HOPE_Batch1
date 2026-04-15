import java.io.*;
public class FileReaderImplementation {
    public static void main(String[] args) {
        try{
        FileReader reader=new FileReader("steve.txt");
        int character;
        while((character=reader.read())!=-1) System.out.print((char)character);
        reader.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

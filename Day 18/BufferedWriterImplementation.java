import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterImplementation {
    public static void main(String[] args) {
        try{
        BufferedWriter writer=new BufferedWriter(new FileWriter("steve.txt",true));
        writer.write("im sfj");
        writer.newLine();
        writer.write("itz wednesday");
        writer.write(" this message will be appended at the end");
        writer.close();
        }catch(Exception e){
            System.out.println(e);
        }

    }
}

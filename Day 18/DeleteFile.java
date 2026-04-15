import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file=new File("steve.txt");
        try{
            if(file.delete()){
                System.out.println("file deleted");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

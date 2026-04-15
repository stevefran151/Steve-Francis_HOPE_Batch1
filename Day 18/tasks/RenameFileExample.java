
import java.io.File;

public class RenameFileExample {
    public static void main(String[] args) {
        File oldFile = new File("newname.txt");
        File newFile = new File("newname1.txt");

        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed successfully");
        } else {
            System.out.println("Rename failed");
        }
    }
}

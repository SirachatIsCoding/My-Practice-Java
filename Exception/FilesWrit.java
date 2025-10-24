import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FilesWrit {
    public static void main(String[] args) {
        // File file = new File("Demo.txt");
        try {
            FileWriter writer = new FileWriter(new File("Name.txt"));
            // ตัวช่วยในการเขียนไฟล์ 
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("Hi everyone eiei\n");
            bw.write("My name is Sirachat Wounsuew\n");
            bw.write("My nickname is Bogie\n");
            bw.close();
            System.out.println("finished writing");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

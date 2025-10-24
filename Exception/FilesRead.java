import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FilesRead {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader(new File("Name.txt"));
            // int data;
            // while ((data = reader.read()) != -1) {
            //     System.out.printf("%c\n", data);
            // }
            BufferedReader br = new BufferedReader(reader);
            String messege = "";
            while ((messege = br.readLine()) != null) {
                System.out.println(messege);
            }
            br.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}

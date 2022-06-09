import java.io.*;
import java.io.IOException;
import java.util.Scanner;
public class prac {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("temp1.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        Scanner sc=new Scanner(bis);
        while(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }
        bis.close();
        fis.close();
    }
}

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class prac {
    public static void main(String[] args) throws IOException 
    {
        FileInputStream fis=new FileInputStream("temp1.txt");
        FileOutputStream fos=new FileOutputStream("temp2.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        int x;
        while((x=bis.read())!=-1)  
        {
                bos.write(x);
        }
        bos.close();
        bis.close();
        fis.close();
        fos.close();
}
}

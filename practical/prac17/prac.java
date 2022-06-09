import java.io.*;
import java.io.IOException;

public class prac {
    public static void main(String[] args) throws IOException 
    {
        FileReader fr=new FileReader("temp1.txt");
        FileWriter fw=new FileWriter("temp2.txt");
        BufferedReader br=new BufferedReader(fr);
        BufferedWriter bw=new BufferedWriter(fw);
        int x;
        while((x=br.read())!=-1)  
        {
                bw.write(x);
        }
        br.close();
        bw.close();
        fr.close();
        fw.close();
}
}

package input_output;

import java.io.FileInputStream;
import java.io.IOException;

public class Read_Byte{
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("file.dat");
        int c;
        while((c = fis.read()) != -1){
            System.out.print((char)c);
        }
        fis.close();
    }
}
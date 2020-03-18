package input_output;

import java.io.FileOutputStream;
import java.io.IOException;
public class Write_Byte{
    public static void main(String[] args) throws IOException{
        FileOutputStream fos = new FileOutputStream("file.dat");
        String text = "Em nên chú ý hơn với chồng em đây nè.\n";
        byte[] textByte = text.getBytes();
        fos.write(textByte);
        fos.close();
    }
}
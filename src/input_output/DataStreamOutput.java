package input_output;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamOutput{
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("file.dat");
            DataOutputStream dos = new DataOutputStream(fos);
            final int NUMBER = 5;
            dos.writeInt(NUMBER);
            for(int i = 0; i <= NUMBER; i++){
                dos.writeInt(i);
            }
            dos.writeUTF("Hello !");
            dos.writeDouble(100.02d);
            dos.flush();
            dos.close();
            fos.close();
        }catch(IOException e){
            System.out.println("Loi: "+e);
        }
    }
}
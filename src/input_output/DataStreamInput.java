package input_output;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataStreamInput{
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("file.dat");
            DataInputStream dis = new DataInputStream(fis);

            int items = dis.readInt();
            for(int i = 0; i <= items; i++){
                System.out.print(dis.readInt()+" ");
            }
            System.out.println(dis.readUTF());
            System.out.println(dis.readDouble());
            fis.close();
            dis.close();
        }catch(IOException e){

        }
    }
}
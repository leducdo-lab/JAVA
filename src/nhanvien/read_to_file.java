package nhanvien;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class read_to_file{
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("nhanvien.txt");
            BufferedReader br = new BufferedReader(fr);
            String text;
            while((text=br.readLine()) != null){
                System.out.println(text);
            }
            br.close();
            fr.close();
        }catch(IOException e){
            System.out.println("Loi: "+e);
        }
    }
}
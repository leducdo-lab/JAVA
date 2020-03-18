package nhanvien;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class write_to_file{
    private static String maNV, hoTen;
    private static int tuoi; 
    private static float luong;
    static NhanVien nhanvien;
    static Scanner scanner = new Scanner(System.in);

    public static String nhap(){
        String ra;
        System.out.println("NHẬP THÔNG TIN NHÂN VIÊN");
        System.out.print("Nhập mã: ");
        maNV = scanner.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = scanner.nextInt();
        System.out.print("Nhập lương: ");
        luong = scanner.nextFloat();
        nhanvien = new NhanVien(maNV, hoTen, tuoi, luong);
        ra = nhanvien.toString();
        return ra;
    }

    public static void write_file(String nhanVien) throws IOException{
        FileWriter fw = new FileWriter("nhanvien.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(nhanVien);

        bw.flush();
        bw.close();
        fw.close();
    }
    public static void main(String[] args) {
        
        try{
            FileWriter fw = new FileWriter("nhanvien.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i = 0; i < 3; i++){
                String write = nhap();
                bw.write(write);
                scanner.nextLine();
            }
            bw.flush();
            bw.close();
            fw.close();
        }catch(IOException e){
            System.out.println("Loi: "+e);
        }
    }
}
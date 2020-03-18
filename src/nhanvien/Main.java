package nhanvien;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        String maNV, hoTen;
        int tuoi;
        float luong;
        Scanner scanner = new Scanner(System.in);
        NhanVien nhanvien;

        try{
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

            System.out.println(nhanvien.toString());
        }catch(Exception e){
            System.out.println("Lỗi: "+e);
        }finally{
            scanner.close();
        }
    }
}
package bt_nhanvien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int soNV_TTG, soNV_BTG;
        Scanner scanner = new Scanner(System.in);
        NhanVien nhanvien;
        ArrayList<NhanVien> arrNhanVien = new ArrayList<>();

        System.out.print("Nhập số nhân viên toàn thời gian: ");
        soNV_TTG = scanner.nextInt();
        System.out.println("NHẬP THÔNG TIN NHÂN VIÊN TOÀN THỜI GIAN");
        for(int i = 0; i < soNV_TTG; i++){
            System.out.println("Nhân viên số "+(i+1));
            nhanvien = new NhanVienToanThoiGian();
            nhanvien.nhapThongTin();
            arrNhanVien.add(nhanvien);
        }

        System.out.print("Nhập số nhân viên bán thời gian: ");
        soNV_BTG = scanner.nextInt();
        System.out.println("NHẬP THÔNG TIN NHÂN VIÊN BÁN THỜI GIAN");
        for(int i = 0; i < soNV_BTG; i++){
            System.out.println("Nhân viên số "+(i+1));
            nhanvien = new NhanVienThoiVu();
            nhanvien.nhapThongTin();
            arrNhanVien.add(nhanvien);
        }

        System.out.println("THÔNG TIN NHÂN VIÊN");
        for(NhanVien nv : arrNhanVien){
            nv.tinhLuong();
            System.out.println(nv.toString());
        }
        scanner.close();
    }
}
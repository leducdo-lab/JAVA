package bt_nhanvien;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NhanVien{
    private String tenNhanVien;
    protected long luongNhanVien;
    Scanner scanner = new Scanner(System.in);
    DecimalFormat decimal = new DecimalFormat("#,###");
    public NhanVien(){
        super();
    }
    public NhanVien(String tenNhanVien, long luongNhanVien){
        super();
        this.tenNhanVien = tenNhanVien;
        this.luongNhanVien = luongNhanVien;
    }
    public void nhapThongTin(){
        System.out.println("Nhập tên nhân viên: ");
        tenNhanVien = scanner.nextLine();
    }

    public void tinhLuong(){

    }
    @Override
    public String toString(){
        return "Tên nhân viên: "+this.tenNhanVien+", Lương: "+decimal.format(this.luongNhanVien)+" VND";
    }
}
package bt_nhanvien;


public class NhanVienToanThoiGian extends NhanVien{
    private int soNgayLamThem, choose;
    private String loaiNhanVien;
    private static long LUONG_NV_THUONG = 10000000;
    private static long LUONG_SEP = 20000000;
    private static long LUONG_LAM_THEM = 800000;

    public NhanVienToanThoiGian(){
        super();
    }
    public NhanVienToanThoiGian(int soNgayLamThem, String loaiNhanVien){
        super();
        this.loaiNhanVien = loaiNhanVien;
        this.soNgayLamThem = soNgayLamThem;
    }

    public int getSoNgayLT(){
        return soNgayLamThem;
    }
    public void setSoNgayLT(int soNgayLamThem){
        this.soNgayLamThem = soNgayLamThem;
    }
    public String getloaiNV(){
        return loaiNhanVien;
    }
    public void setloaiNV(String loaiNhanVien){
        this.loaiNhanVien = loaiNhanVien;
    }

    public void nhapThongTin(){
        super.nhapThongTin();
        System.out.println("Nhập số ngày làm thêm: ");
        soNgayLamThem = scanner.nextInt();
        System.out.println("Nhập loại nhân viên: 1. Sếp\t2. Nhân viên thường");
        choose = scanner.nextInt();
        switch(choose){
            case 1: 
                loaiNhanVien = "Sếp";
                break;
            case 2:
                loaiNhanVien = "Nhân viên thường";
                break;
            default:
                System.out.println("Bạn hãy chọn đúng.");
                break;
        }
    }

    public void tinhLuong(){
        if(loaiNhanVien.equals("Nhân viên thường")){
            luongNhanVien = LUONG_NV_THUONG + this.soNgayLamThem *LUONG_LAM_THEM;
        }else if(loaiNhanVien.equals("Sếp")){
            luongNhanVien = LUONG_SEP + this.soNgayLamThem *LUONG_LAM_THEM;
        }
    }

    @Override
    public String toString(){
        return super.toString() + ", loại nhân viên: "+this.loaiNhanVien+", số ngày làm thêm: "+this.soNgayLamThem;
    }
}
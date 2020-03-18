package bt_nhanvien;

public class NhanVienThoiVu extends NhanVien{
    private int gioLamViec;
    private static long LUONG_THOI_VU = 100000;

    public NhanVienThoiVu(){
        super();
    }
    public NhanVienThoiVu(int gioLamViec){
        super();
        this.gioLamViec = gioLamViec;
    }

    public int getGioLamViec(){
        return gioLamViec;
    }
    public void setGioLamViec(int gioLamViec){
        this.gioLamViec = gioLamViec;
    }

    public void nhapThongTin(){
        super.nhapThongTin();
        System.out.println("Nhập số giờ làm việc: ");
        gioLamViec = scanner.nextInt();
    }

    public void tinhLuong(){
        luongNhanVien = LUONG_THOI_VU * this.gioLamViec;
    }

    @Override
    public String toString(){
        return super.toString() +", giờ làm việc: "+this.gioLamViec;
    }
}
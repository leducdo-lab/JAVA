package bt_giaodich;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GiaoDich{
    private String maGiaoDich, ngayGiaoDich;
    private long donGia;
    protected long thanhtien;
    private float dienTich;
    Scanner scanner = new Scanner(System.in);
    DecimalFormat decimal = new DecimalFormat("#,###");

    public GiaoDich(){
        super();
    }
    public GiaoDich(String maGiaoDich, String ngayGiaoDich, long donGia, float dienTich){
        super();
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public String getMaGD(){
        return maGiaoDich;
    }
    public void setMaGD(String maGiaoDich){
        this.maGiaoDich = maGiaoDich;
    }
    public String getNgayGD(){
        return ngayGiaoDich;
    }
    public void setNgayGD(String ngayGiaoDich){
        this.ngayGiaoDich = ngayGiaoDich;
    }
    public long getDonGia(){
        return donGia;
    }
    public void setDonGia(long donGia){
        this.donGia = donGia;
    }
    public float getDienTich(){
        return dienTich;
    }
    public void setDienTich(float dienTich){
        this.dienTich = dienTich;
    }

    public long getThanhTien(){
        return thanhtien;
    }

    public void nhap(){
        System.out.print("Nhập mã giao dịch: ");
        maGiaoDich = scanner.nextLine();
        System.out.print("Nhập (ngày/tháng/năm): ");
        ngayGiaoDich = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = Long.parseLong(scanner.nextLine());
        System.out.print("Nhập diện tích: ");
        dienTich = Float.parseFloat(scanner.nextLine());
    }

    @Override
    public String toString(){
        return "Mã giao dịch: "+this.maGiaoDich+", ngày giao dịch: "+this.ngayGiaoDich+", đơn giá: "+
        decimal.format(this.donGia)+", diện tích: "+ this.dienTich+", thành tiền: "+decimal.format(this.thanhtien);
    }
}
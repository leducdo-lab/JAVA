package bt_giaodich;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    private static Scanner scanner = new Scanner(System.in);
    static ArrayList<Dat> arrThongTin_Dat = new ArrayList<>();
    static ArrayList<Nha> arrThongTin_Nha = new ArrayList<>();
    static DecimalFormat decimal = new DecimalFormat("#.###");
    public static void main(final String[] args) {
        Dat dat;
        Nha nha;
        int soGDDat = 0, soGDNha = 0;
        long tongtienGDD = 0;
		long trungbinhtien = 0;
        
        System.out.print("Nhập số giao dịch đất: ");
        soGDDat = scanner.nextInt();
        System.out.print("Nhập số giao dịch nhà: ");
        soGDNha = scanner.nextInt();

        System.out.println("NHẬP THÔNG TIN GIAO DỊCH ĐẤT");
        for(int i = 0; i < soGDDat; i++){
            System.out.println("Giao dịch số "+(i+1));
            dat = new Dat();
            dat.nhap();
            arrThongTin_Dat.add(dat);
        }
        System.out.println("NHẬP THÔNG TIN GIAO DỊCH NHÀ");
        for(int i = 0; i < soGDNha; i++){
            System.out.println("Giao dịch số "+(i+1));
            nha = new Nha();
            nha.nhap();
            arrThongTin_Nha.add(nha);
        }

        System.out.println("---------- Thông Tin Giao Dịch Đất ----------");
        for(Dat gd : arrThongTin_Dat){
            if(gd.getLoaiDat().equalsIgnoreCase("A")){
                gd.thanhtien = (long) (gd.getDonGia() * gd.getDienTich() * 1.5);
            }else if(gd.getLoaiDat().equalsIgnoreCase("B") || gd.getLoaiDat().equalsIgnoreCase("C")){
                gd.thanhtien = (long) (gd.getDonGia() * gd.getDienTich());
            }
            System.out.println(gd.toString());
        }
        System.out.println("---------- Thông Tin Giao Dịch Nhà ----------");
        for(Nha gd : arrThongTin_Nha){
            if(gd.getLoaiNha().equals("Cao Cấp")){
                gd.thanhtien = (long) (gd.getDienTich() * gd.getDonGia() * 0.9);
            }else if(gd.getLoaiNha().equals("Thường")){
                gd.thanhtien = (long) (gd.getDonGia() * gd.getDienTich());
            }
            System.out.println(gd.toString());
        }

        for(Dat gd : arrThongTin_Dat){
            tongtienGDD += gd.getThanhTien();
        }

        trungbinhtien = tongtienGDD/arrThongTin_Dat.size();
        System.out.println("Trung bình thành tiền giao dịch đất: "+decimal.format(trungbinhtien));

        System.out.println("Các giao dịch đất của tháng 9 năm 2013: ");
        for(Dat gd : arrThongTin_Dat){
            String[] ads = gd.getNgayGD().split("/");
            if(ads[1].equals("9") && ads[2].equals("2013")){
                System.out.println(gd.toString());
            }
        }

        System.out.println("Các giao dịch nhà của tháng 9 năm 2013: ");
        for(Nha gd : arrThongTin_Nha){
            String[] ads = gd.getNgayGD().split("/");
            if(ads[1].equals("9") && ads[2].equals("2013")){
                System.out.println(gd.toString());
            }
        }
    }
}
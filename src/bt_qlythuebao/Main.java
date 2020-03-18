package bt_qlythuebao;

import java.util.Random;
import java.util.Scanner;

public class Main{
    static int choose, soPhut, soMB;
    static DichVu dichvu;
    static Scanner scanner = new Scanner(System.in);
    static DSDichVu danhsach = new DSDichVu();

    public static void case_4(){
        System.out.println("1. Dial Up\n2. ADSL\n3. T1\n4. Toàn bộ");
        System.out.print("Chọn chức năng (1-4): ");
        choose = scanner.nextInt();
        switch(choose){
            case 1:
                danhsach.hienthiDialUp();
                break;
            case 2:
                danhsach.hienthiADSL();
                break;
            case 3:
                danhsach.hienthiT1();
                break;
            default:
                if(choose == 4){
                    danhsach.hienthi();
                    break;
                }
                break;
        }
    }

    public static void case_7(){
        System.out.println("1. Dial Up\n2. ADSL");
        System.out.print("Chọn chức năng (1-2): ");
        choose = scanner.nextInt();
        switch(choose){
            case 1:
                danhsach.hienthiDialUp_max();
                break;
            case 2:
                danhsach.hienthiDVADSL_max();
                break;
            default:
                System.out.println("Bạn chọn lại!!!");
                break;
        }
    }
    public static void main(String[] args) {
        Random rd = new Random();
        System.out.println("========== MENU ==========");
        System.out.println("1. Thêm thuê bao Dial Up\n2. Thêm thuê bao ADSL\n3. Thêm thuê bao T1\n"+
        "4. Hiển thị danh sách dịch vụ\n5. Tính tổng cước từng loại\n6. Tổng cước của tất cả\n7. Hiển thị thông tin thuê bao có tiền cước lớn nhất"+
        "\n8.EXIT");
        do{
            System.out.print("Chọn chức năng (1-8): ");
            choose = scanner.nextInt();
            switch(choose){
                case 1:
                    soPhut = 10 +rd.nextInt(100);
                    dichvu = new DVDialUp(soPhut);
                    danhsach.themDV(dichvu);
                    System.out.println("Thêm thành công.");
                    break;
                case 2:
                    soMB = 10 +rd.nextInt(50);
                    dichvu = new DVADSL(soMB);
                    danhsach.themDV(dichvu);
                    System.out.println("Thêm thành công.");
                    break;
                case 3:
                    dichvu = new DVT1();
                    danhsach.themDV(dichvu);
                    System.out.println("Thêm thành công.");
                    break;
                case 4:
                    case_4();
                    break;
                case 5:
                    System.out.println("Tổng số tiền của từng loại");
                    danhsach.tinhtongtien_of_tung_DV();
                    break;
                case 6:
                    System.out.println("Tổng số tiền của tất cả");
                    danhsach.tinhtongtienDV();
                    break;
                case 7:
                    case_7();
                    break;
                default:
                    if(choose != 8){
                        System.out.println("Bạn phải chọn đúng chức năng 1-8.");
                        break;
                    }
                    break;
            }
        }while(choose != 8);
    }
}
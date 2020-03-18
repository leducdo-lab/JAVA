package class_new;

import java.util.Scanner;
import java.util.TreeMap;

public class Thu_Vien{
    private static Scanner scanner = new Scanner(System.in);
    private static TreeMap<String, Book> thu_vien = new TreeMap<String, Book>();
    private static int chon;

    public static int menu(){
        System.out.println("=========== Menu ==========");
        System.out.println("1. Thêm sách\n2. Hiển thị sách\n3. Tìm sách\n0. Exit");
        System.out.print("==> ");
        chon = scanner.nextInt();
        return chon;
    }

    public static int nhap(int n, int ma){
        String id_book, book_name, tac_gia;
        int tong_sach, sach_muon;
        int maso = ma;
        scanner.nextLine();
        for(int i = 0; i < n; i++){
            if(i >= 1){ scanner.nextLine();}
            System.out.println("Cuốn sách: "+(i+1));
            System.out.print("Nhập tên sách: ");
            book_name = scanner.nextLine();
            System.out.print("Nhập tên tác giả: ");
            tac_gia = scanner.nextLine();
            System.out.print("Nhập tổng sách: ");
            tong_sach = scanner.nextInt();
            id_book = "BK-"+ (maso + i);
            sach_muon = 0;
            Book book = new Book(book_name, tong_sach, sach_muon, tac_gia);
            thu_vien.put(id_book, book);
        }
        maso += n;
        return maso;
    }
    public static void hienthi(){
        System.out.println("Danh sách:");
        thu_vien.forEach((key, value)->{
            System.out.println("ID sách: "+key);
            value.hienthi();
        });
    }
    public static void search_id(){
        String id;
        scanner.nextLine();
        System.out.print("Nhập ID: ");
        id = scanner.nextLine();
        thu_vien.forEach((key, value)->{
            if(key.contentEquals(id)){
                System.out.println("ID sách: "+key);
                value.hienthi();
            }
        });
    }
    public static void search_name(){
        String name;
        scanner.nextLine();
        System.out.println("Nhập name: ");
        name = scanner.nextLine();
        thu_vien.forEach((key, value)->{
            if(value.getBook_name().contentEquals(name)){
                System.out.println("ID sách: "+key);
                value.hienthi();
            }
        });
    }
    public static void search_tg(){
        String tacgia;
        scanner.nextLine();
        System.out.print("Nhập tác giả: ");
        tacgia = scanner.nextLine();
        thu_vien.forEach((key, value)->{
            if(value.get_tacGia() == tacgia){
                System.out.println("ID sách: "+key);
                value.hienthi();
            }
        });
    }
    public static void search(){
        do{
            System.out.println("Bạn muốn tìm theo tiêu chí nào.");
            System.out.println("1. ID sách\n2. Tên sách\n3. Tác Giả");
            System.out.print("==> ");
            chon = scanner.nextInt();
            switch(chon){
                case 1:
                    search_id();
                    break;
                case 2:
                    search_name();
                    break;
                case 3:
                    search_tg();
                    break;
                default:
                    if(chon != 1 && chon != 2 && chon != 3){
                        System.out.println("Chọn đúng nào!");
                    }
                    break;
            }
        }while(chon != 1 && chon != 2 && chon != 3);
    }

    public static void main(String[] args) {
        int n;
        int ma = 1000;
        do{
            chon = menu();
            switch(chon){
                case 1:
                    System.out.print("Nhập số sách muốn nhập: ");
                    n = scanner.nextInt();
                    ma = nhap(n, ma);
                    
                    break;
                case 2:
                    hienthi();
                    break;
                case 3:
                    search();
                    break;
                default :
                    if(chon != 0){
                        System.out.println("Bạn nên phải chọn lại.");
                    }
                    break;
            }
        }while(chon != 0);
    }
}
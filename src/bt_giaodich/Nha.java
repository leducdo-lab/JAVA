package bt_giaodich;

public class Nha extends GiaoDich{
    private String loaiNha, diaChi;
    private int choose;

    public Nha(){
        super();
    }
    public Nha(String loaiNha, String diaChi){
        super();
        this.diaChi = diaChi;
        this.loaiNha = loaiNha;
    }

    public void setLoaiNha(String loaiNha){
        this.loaiNha = loaiNha;
    }
    public String getLoaiNha(){
        return loaiNha;
    }
    public void setDiaChi(String diaChi){
        this.diaChi = diaChi;
    }
    public String getDiaChi(){
        return diaChi;
    }

    public void nhap(){
        super.nhap();
        System.out.print("Nhập địa chỉ: ");
        diaChi = scanner.nextLine();
        do{
            System.out.print("Loại nhà (1. Cao cấp / 2. Thường): ");
            choose = scanner.nextInt();
            switch(choose){
                case 1:
                    loaiNha = "Cao Cấp";
                    break;
                case 2:
                    loaiNha = "Thường";
                    break;
                default:
                    System.out.println("Chọn sai loại nhà.");
                    break;
            }
        }while(choose != 1 && choose != 2);
    }

    public String toString(){
        return super.toString() +", loại nhà: "+this.loaiNha+", địa chỉ: "+this.diaChi;
    }

}
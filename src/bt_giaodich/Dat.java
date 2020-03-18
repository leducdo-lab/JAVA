package bt_giaodich;

public class Dat extends GiaoDich{
    private String loaiDat;

    public Dat(){
        super();
    }
    public Dat(String loaiDat){
        super();
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat(){
        return loaiDat;
    }
    public void setLoaiDat(String loaiDat){
        this.loaiDat = loaiDat;
    }

    public void nhap(){
        super.nhap();
        System.out.print("Nhập loại đất(A||B||C): ");
        loaiDat = scanner.nextLine();
    }

    @Override
    public String toString(){
        return super.toString() +", loại đất: "+this.loaiDat;
    }
}
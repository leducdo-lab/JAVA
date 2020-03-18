package nhanvien;

public class NhanVien{
    private String maNV, hoTen;
    private int tuoi;
    private float luong;

    public NhanVien(){
        super();
    }
    public NhanVien(String maNV, String hoTen, int tuoi, float luong){
        super();
        this.hoTen = hoTen;
        this.luong = luong;
        this.maNV = maNV;
        this.tuoi = tuoi;
    }

    public void setMaNV(String maNV){
        this.maNV = maNV;
    }
    public String getMaNV(){
        return maNV;
    }
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    public String getHoTen(){
        return hoTen;
    }
    public void setTuoi(int tuoi){
        this.tuoi = tuoi;
    }
    public int getTuoi(){
        return tuoi;
    }
    public void setLuong(float luong){
        this.luong = luong;
    }
    public float getLuong(){
        return luong;
    }

    @Override
    public String toString(){
        return maNV+", "+hoTen+", "+tuoi+", "+luong+"\n";
    }
}
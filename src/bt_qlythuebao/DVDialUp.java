package bt_qlythuebao;

public class DVDialUp extends DichVu{
    private static int THUE_BAO_HANG_THANG = 30000;
    private static int TIEN_PHUT = 30;
    private int soPhutTruyCap;

    public DVDialUp(){
        super();
    }
    public DVDialUp(int soPhutTruyCap){
        super();
        this.soPhutTruyCap = soPhutTruyCap;
    }

    @Override
    public long tinhtien() {
        // TODO Auto-generated method stub
        return THUE_BAO_HANG_THANG + this.soPhutTruyCap * TIEN_PHUT;
    }

    @Override
    public String toString(){
        return "Dịch vụ DialUp có giá tháng là: "+DVDialUp.THUE_BAO_HANG_THANG +
        ", đơn giá phút = "+ DVDialUp.TIEN_PHUT + "/Phút, số phút truy cập = " + this.soPhutTruyCap
                +
        ", tổng tiền = "+decimal.format(tinhtien());
    }
    
}
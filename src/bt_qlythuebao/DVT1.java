package bt_qlythuebao;

public class DVT1 extends DichVu{
    private static int THUE_BAO_THANG = 2000000;
    
    public DVT1(){
        super();
    }
    
    @Override
    public long tinhtien(){
        return THUE_BAO_THANG;
    }

    @Override
    public String toString(){
        return "Dịch vụ T1 có giá tháng = "+DVT1.THUE_BAO_THANG+", tổng tiền = "+decimal.format(tinhtien());
    }
}
package bt_qlythuebao;

public class DVADSL extends DichVu{
    private static int THUE_BAO_THANG = 50000;
    private static int TIEN_MB = 50;
    private int soMB;

    public DVADSL(){
        super();
    }
    public DVADSL(int soMB){
        super();
        this.soMB = soMB;
    }

    @Override
    public long tinhtien(){
        return THUE_BAO_THANG + this.soMB * TIEN_MB;
    }

    public String toString(){
        return "Dịch vụ ADSL có giá tháng = "+DVADSL.THUE_BAO_THANG+", Giá MB = "+DVADSL.TIEN_MB+
        "/MB, số MB truy cập = "+this.soMB+", tổng tiền = "+decimal.format(tinhtien());
    }
}
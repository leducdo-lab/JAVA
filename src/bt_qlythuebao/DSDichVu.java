package bt_qlythuebao;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class DSDichVu{
    static DecimalFormat decimal = new DecimalFormat("#,###");
    ArrayList<DichVu> arrDV = new ArrayList<>();
    long tongcuocDialUp = 0, tongcuocADSL = 0, tongcuocT1 = 0;

    public DSDichVu(){
        super();
    }

    public void themDV(DichVu dichvu){
        arrDV.add(dichvu);
    }

    public void hienthi(){
        for(DichVu dv : arrDV)
        {
            System.out.println(dv.toString());
        }
    }

    public void hienthiDialUp(){
        for(DichVu dv : arrDV)
        {
            if(dv instanceof DVDialUp){
                System.out.println(dv.toString());
            }
        }
    }
    public void hienthiADSL(){
        for(DichVu dv : arrDV)
        {
            if(dv instanceof DVADSL){
                System.out.println(dv.toString());
            }
        }
    }
    public void hienthiT1(){
        for(DichVu dv : arrDV)
        {
            if(dv instanceof DVT1){
                System.out.println(dv.toString());
            }
        }
    }


    public void tinhtongtien_of_tung_DV(){
        for(DichVu dv : arrDV){
            if(dv instanceof DVDialUp){
                tongcuocDialUp += dv.tinhtien();
            }else if(dv instanceof DVADSL){
                tongcuocADSL += dv.tinhtien();
            }else if(dv instanceof DVT1){
                tongcuocT1 += dv.tinhtien();
            }
        }
        System.out.println("Tổng tiền của DialUP là: "+decimal.format(tongcuocDialUp));
        System.out.println("Tổng tiền của ADSL là: "+decimal.format(tongcuocADSL));
        System.out.println("Tổng tiền của T1 là: "+decimal.format(tongcuocT1));
    }

    public void tinhtongtienDV(){
        long tongtien = tongcuocADSL + tongcuocDialUp + tongcuocT1;
        System.out.println("Tổng tiền tất cả các dịch vụ là: "+decimal.format(tongtien));
    } 

    public void hienthiDVADSL_max(){
        long temp = 0;
        DVADSL adsl = new DVADSL();
        for(DichVu dv : arrDV){
            if(dv instanceof DVADSL){
                if(temp < dv.tinhtien()){
                    temp = dv.tinhtien();
                    adsl = (DVADSL) dv;
                }
            }
        }
        System.out.println(adsl.toString());
    }
    public void hienthiDialUp_max(){
        long temp = 0;
        DVDialUp adsl = new DVDialUp();
        for(DichVu dv : arrDV){
            if(dv instanceof DVDialUp){
                if(temp < dv.tinhtien()){
                    temp = dv.tinhtien();
                    adsl = (DVDialUp) dv;
                }
            }
        }
        System.out.println(adsl.toString());
    }
    
}
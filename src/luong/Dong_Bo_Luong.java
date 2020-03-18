package luong;

public class Dong_Bo_Luong{
    private long money = 100000;

    public Dong_Bo_Luong() {
        System.out.println("Tài khoản hiện có: " + money);
    }

    private synchronized void rut_tien(long rut) {
        System.out.println("Giao dịch rút tiền đang thực hiện với số tiền = "+rut+"...");
        if(rut > money){
            System.out.println("Số tiền trong tài khoản không đủ!!!");
            try{
                wait(); // ngủ
            }catch(InterruptedException ie){
                System.out.println("Lỗi : "+ie);
            }
        }
        money -= rut;
        System.out.println("Rút tiền thành công\nSố tiền còn lại: "+money);
    }

    private synchronized void nop_tien(long nop){
        System.out.println("Giao dịch nộp tiền đang thực hiên với số tiền = "+nop+"...");
        money += nop;
        System.out.println("Nộp thành công.\nSố tiền trong tài khoản = "+money);
        notify();// đánh thức thread trk đó đã ngủ
    }
    public static void main(String[] args) {
        final Dong_Bo_Luong dbl = new Dong_Bo_Luong();
        Thread thread1 = new Thread(){
            public void run(){
                dbl.rut_tien(200000);
            }
        };
        thread1.start();

        Thread thread2 = new Thread(){
            public void run(){
                dbl.nop_tien(200000);
            }
        };
        thread2.start();
    }
}
package jv2_190527_inclass4.example1;

public class SubThread extends Thread {
    public Snt x;

    public SubThread(Snt x){
        this.x = x;
    }
    public void run(){
        for (int j = 0; j < 100; j++) {
            synchronized (x){
                for (int i = x.snt + 1; true; i++) {
                    if (checkSNT(i)) {
                        System.out.println("SNT: " + i);
                        x.snt = i;
                        break;
                    }
                }
            }
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }

        //        for (int j = 0; j < 100; j++) {
//                for (int i = Main.x + 1; true; i++) {
//                    if (checkSNT(i)) {
//                        System.out.println("SNT: " + i);
//                        Main.x = i;
//                        break;
//                    }
//            }
//            try {
//                Thread.sleep(500);
//            } catch (Exception e) {
//            }
//        }
    }
    public boolean checkSNT(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

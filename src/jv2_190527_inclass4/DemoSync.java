package jv2_190527_inclass4;

public class DemoSync {

    public static void main(String args[]) {
        Counter ct = new Counter();
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
// Sync time ngắn nhất có thể tránh chờ nhau
                for (int i = 0; i < 100; i++) {
//                    synchronized (ct) {
                    ct.upNumber();
                    ct.printNumber();
//                }
                    // Sync cần tránh sleep vì sleep giữ object
                    try {
                        Thread.sleep(200);
                    } catch (Exception e) {
                    }
                }
            }
//            public void run() {
//                synchronized (ct){
//                    for (int i = 0; i < 100; i++) {
//
//                        ct.upNumber();
//                        ct.printNumber();
//                        try {
//                            Thread.sleep(200);
//                        } catch (Exception e) {
//
//                        }
//                    }
//                }
//            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
        Thread t2 = new Thread(r1);
        t2.start();
        for (int i = 0; i < 100; i++) {
            ct.upAndShowZ();
            try {
                Thread.sleep(200);
            } catch (Exception e) {

            }
        }
    }
}

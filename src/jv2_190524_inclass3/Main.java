package jv2_190524_inclass3;

public class Main {
    public static void main(String args[]) {
//        SubThread t = new SubThread();
//        t.setName("Luong thu nhat");
//        t.start();
//        SubThread t2 = new SubThread();
//        t2.start();
//        for (int i = 0; i < 100; i++) {
//            Thread.currentThread().setName("Set lai ten cho main");
//            System.out.println(Thread.currentThread().getName() + " i = " + i);
//            try {
//                Thread.sleep(900);
//            } catch (Exception e) {
//
//            }
//        }
        // Cach 2
//        RunThread r = new RunThread();
//        Thread tr = new Thread(r);
//        tr.start();
//
        int XYZ = 100;
        //Cach 3
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < XYZ; i++) {
                    Thread.currentThread().setName("Khong co ten");
                    System.out.println(Thread.currentThread().getName() + " i = " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {

                    }
                }
            }
        };
        Thread tr2 = new Thread(r2);
        tr2.start();
        // new Thread(r2).start();
    }
}

package jv2_190527_inclass4;

public class Main {
    public static void main(String args[]) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 30; i++) {
                    System.out.println("i = " + i);
                    try {
                        Thread.sleep(300);
                    } catch (Exception e) {

                    }
                }
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("t2 - i = " + i);
                    try {
                        Thread.sleep(400);
                    } catch (Exception e) {

                    }
                }
            }
        };
        Thread t1 = new Thread(r);
        t1.setPriority(6);
//        t1.setDaemon(true);
        t1.start();

        Thread t2 = new Thread(r2);
        t2.start();
        try {
            t2.join();
        } catch (Exception e) {

        }
        //Main Thread

        for (int i = 0; i < 10; i++) {
            System.out.println("main running - " + i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {

            }
        }
    }
}

package jv2_190527_inclass4.keyex1;

public class Main {
    public static Integer x = 2;

    public static void main(String args[]) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < 100; j++) {
                    synchronized (x) {
                        for (int i = x + 1; true; i++) {
                            if (checkSNT(i)) {
                                System.out.println("SNT: " + i);
                                x = i;
                                break;
                            }
                        }
                    }
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                    }
                }
            }

            public boolean checkSNT(int n) {
                for (int i = 2; i <= n / 2; i++) {
                    if (n % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        };
        Thread t = new Thread(r);
        t.start();
        Thread t2 = new Thread(r);
        t2.start();
    }
}

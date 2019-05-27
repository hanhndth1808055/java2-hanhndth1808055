package jv2_190524_inclass3;

public class SubThread extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            Thread.currentThread().setName("Khong co ten");
            System.out.println(Thread.currentThread().getName() + " i = " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}

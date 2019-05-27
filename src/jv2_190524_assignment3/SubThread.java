package jv2_190524_assignment3;

public class SubThread extends Thread {
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.println(10 - i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
        System.out.println("Happy New Year!!!");
    }
}

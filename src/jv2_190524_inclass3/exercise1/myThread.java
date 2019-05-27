package jv2_190524_inclass3.exercise1;

public class myThread extends Thread {
    public void run() {
        System.out.println("Name of Thread: " + Thread.currentThread().getName());
        Thread.currentThread().setName("myJavaThread");
        System.out.println("Name of Thread: " + Thread.currentThread().getName());
        int n = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(n);
            n += 2;
            try {
                Thread.sleep(1500);
            } catch (Exception e) {

            }
        }
    }
}

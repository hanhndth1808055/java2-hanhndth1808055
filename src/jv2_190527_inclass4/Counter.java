package jv2_190527_inclass4;

public class Counter {

    public int x = 0;
    public int y = 0;
//Ví dụ z là phương thức bị vạ lây khi đối tượng bị giữ trong Sync
    public int z = 0;

    public synchronized void upNumber() {
        x++;
        y++;
    }

    public synchronized void printNumber() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public void upAndShowZ() {
        z++;
        System.out.println("z = " + z);
    }
}

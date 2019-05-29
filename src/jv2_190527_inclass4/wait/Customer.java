package jv2_190527_inclass4.wait;

public class Customer {
    public int money = 30000;

    public synchronized void rutTien(int m) {
        if (money < m) {
            System.out.println("Tien trong tk khong du");
            try {
                wait();
            } catch (Exception e) {

            }
//            return;
        }
        if (money > m) {
            money -= m;
            System.out.println("Rut tien thanh cong");
        }
    }

    public synchronized void napTien(int m) {
        money += m;
        System.out.println("Nap tien thanh cong");
        notify();
    }
}
//Phòng tránh deadlock => concurrent => Tao B' = B de tranh deadlock A, B

//Cài Xammp 7.1 - 7.2

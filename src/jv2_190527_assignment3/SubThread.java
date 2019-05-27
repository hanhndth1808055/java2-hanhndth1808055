package jv2_190527_assignment3;

public class SubThread extends Thread {
    public int number = 2;
    public boolean isSoNguyenTo(int x) {
        if (x <= 0) {
            return false;
        }
        if (x == 1) {
            return false;
        }
        if (x == 2) {
            return true;
        }

        if (x % 2 == 0) {
            return false;
        }
        if (x == 3) {
            return true;
        }

        for (int i = 3; i < x / 2; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void run() {
        System.out.println("Number: " + number);
        for (int i = number + 1; i > number; i++) {
            if (isSoNguyenTo(i)) {
                number = i;
                System.out.println("So nguyen to tiep theo la: " + number);
                try {
                    Thread.sleep(1000);
                } catch (Exception e){

                }
            }
        }
    }
}

package jv2_190524_inclass3.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Please insert the minutes: ");
                Scanner sc = new Scanner(System.in);
                int minute = sc.nextInt();
                sc.nextLine();
                System.out.println(String.format("%02d", minute) + ":00");
                for (int i = (minute-1); i >= 0; i--) {
                    for (int j = 59; j >= 0; j--) {
                        System.out.println(String.format("%02d", i) + ":" + String.format("%02d", j));
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                    }
                }
                System.out.println("Bummmmmm");
            }
        };

        Thread tr = new Thread(r);
        tr.start();
    }
}

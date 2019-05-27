package jv2_190524_assignment3;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
// YC1:
//      SubThread s = new SubThread();
//        s.start();
//       YC2:
//        for (; ; ) {
//            new SubThread().run();
//        }
//Cach 2:
//        RunThread r = new RunThread();
//        Thread tr2 = new Thread(r);
//        tr2.start();
//        Cach 3:
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
//                int i = 10; i>=0; i--
                System.out.println("Please insert your phrase: ");
                Scanner sc = new Scanner(System.in);
                String msg = sc.nextLine();
                while (true) {
                    for (int i = 0; i < 11; i++) {
                        System.out.println((10 - i) + "s");
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                    }
                    System.out.println(msg);
                }

            }
        };

        Thread tr3 = new Thread(r2);
        tr3.start();
//        for (;;){
//            tr3.run();
//        }
    }

}

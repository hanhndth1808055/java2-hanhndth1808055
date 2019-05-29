package java2_190528_assignment4;

import javafx.scene.control.TextArea;

public class Count {
    public TextArea txtCount;

    public void countDown() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                txtCount.setText(String.format("%02d", 10) + ":" + String.format("%02d", 0));
                try {
                    Thread.sleep(1000);
                } catch (Exception e){

                }
                for (int i = 9; i >= 0; i--) {
                    for (int j = 59; j >= 0; j--) {
                        txtCount.setText(String.format("%02d", i) + ":" + String.format("%02d", j));
                        try {
                            Thread.sleep(1000);
                        }catch (Exception e){

                        }
                    }
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}

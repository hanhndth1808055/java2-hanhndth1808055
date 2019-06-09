package jv2_190607_lab9_2;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeController {
    public TextField txtClock;
    public TextField txtDate;
    public Button startBtn;
    public Button pauseBtn;

    public boolean stop = false;

    public void start() {
        stop = false;
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Runnable updater = new Runnable() {
                    @Override
                    public void run() {
                        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
                        String dt1 = LocalDate.now().format(formatter1);
                        txtDate.setText(dt1);
                        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("hh:mm:ss");
                        String dt2 = LocalTime.now().format(formatter2);
                        txtClock.setText(dt2);
                    }
                };
                while (!stop) {
                    try {
                        Platform.runLater(updater);
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {

                    }
                }

            }


        });
        thread.setDaemon(true);
        thread.start();
    }

    public void pause() {
        stop = true;
    }
}

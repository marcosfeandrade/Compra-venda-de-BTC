import java.io.*;
import java.lang.Thread;

public class Mercado implements Runnable {
    private double btc = 3;
    private double percentual;

    @Override
    public void run() {
        while(true) {
            try {
                percentual = Math.random() * (10 - (-10)) + -10;
                btc = btc + (btc * (percentual / 100));
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public double getBTC() {
        return btc;
    }
}
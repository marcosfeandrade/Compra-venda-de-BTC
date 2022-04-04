public class Mercado implements Runnable {
    private double valor;

    @Override
    public void run() {
       valor = Math.random() * (10 - (-10)) + -10;
    }

    public double getValue() {
        return valor;
    }
}
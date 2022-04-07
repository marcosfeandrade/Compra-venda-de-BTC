public class App {

    public static void main(String[] args) throws Exception {
        Carteira carteira = new Carteira();
        Thread threadCarteira = new Thread(carteira);
        threadCarteira.start();
    }
}
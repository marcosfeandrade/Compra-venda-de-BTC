import java.util.Scanner;
import java.io.*;
import java.lang.Thread;

public class Carteira implements Runnable {
    private double carteiraDolar = 0;
    private double carteiraBTC = 0;
    private double valorBTC = 0;
    private Scanner in = new Scanner(System.in);
    private Mercado mercado = new Mercado();
    private Thread threadMercado = new Thread(mercado);

    public Carteira() {}

    @Override
    public void run() {
        int op = 1;
        threadMercado.start();
        do {
            menu();
            op = in.nextInt();
            switch (op) {
                case 1:
                    compra();
                    break;
                case 2:
                    venda();
                    break;
                case 3:
                    sacar();
                    break;
                case 0:
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (op != 0);
    }

    public void menu() {
        System.out.println("1 - Comprar");
        System.out.println("2 - Vender");
        System.out.println("3 - Sacar dinheiro");
        System.out.println("0 - Sair");
        System.out.print("Opção: ");
    }

    public void compra() {
        this.valorBTC = this.mercado.getBTC();
        System.out.println("Informe o valor a ser depositado em Dolar:");
        double valor = in.nextDouble();
        this.carteiraBTC = this.carteiraBTC + (valor / this.valorBTC);
        System.out.println("Valor BTC: " + this.valorBTC);
        System.out.println("Compra! Carteira: BTC" + this.carteiraBTC);
        System.out.println("Compra! Carteira: $" + this.carteiraDolar);
    }

    public void venda() {
        this.valorBTC = this.mercado.getBTC();
        System.out.println("Informe o valor a ser sacado em BTC:");
        double valor = in.nextDouble();
        if(this.carteiraBTC >= valor) {
            this.carteiraBTC = this.carteiraBTC - valor;
            this.carteiraDolar = this.carteiraDolar + (valor * this.valorBTC);
            System.out.println("Valor BTC: " + this.valorBTC);
            System.out.println("Venda! Carteira: $" + this.carteiraDolar);
            System.out.println("Venda! Carteira: BTC" + this.carteiraBTC);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void sacar() {
        if(this.carteiraDolar > 0) {
            System.out.println("Informe o valor a ser sacado em Dolar:");
            double valor = in.nextDouble();
            if(this.carteiraDolar >= valor) {
                this.carteiraDolar = this.carteiraDolar - valor;
                System.out.println("Saque! Carteira: $" + this.carteiraDolar);
            } else {
                System.out.println("Saldo insuficiente!");
            }
            
        } else {
            System.out.println("Não há dinheiro para sacar!");
        }
    }
}
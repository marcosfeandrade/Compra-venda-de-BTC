import java.util.Scanner;
import java.math.*;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
        System.out.println("Digite qual o percentual acrescentado ao gráfico para venda: ");
        double percentualVenda = in.nextDouble();
        System.out.println("Digite qual o percentual acrescentado ao gráfico para compra: ");
        double percentualCompra = in.nextDouble();
        System.out.println("Digite a quantidade de transações: ");
        int qtd = in.nextInt();
        System.out.println("Informe o valor atual do BTC: ");
        double valor = in.nextDouble();
        System.out.println("Insira quanto você quer investir (dolar): ");
        double carteiraDolar = in.nextDouble();
        System.out.println("Insira o percentual a ser usado nas compra: ");
        double compraBTC = in.nextDouble();
        System.out.println("Insira o percentual a ser usado nas venda: ");
        double vendaBTC = in.nextDouble();
        double carteiraBTC = 0;
        double percentual = 0;

        // for(int i = 0; i < qtd; i++){
        //     else if (percentualVenda >= percentual) vende;

        //     else faz nada

        //     sout deseja parar? s break
        // }
    }

}

/* Runnable r = () -> System.out.println("Thread com função lambda!");
new Thread(r).start(); */

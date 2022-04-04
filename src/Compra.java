public class Compra implements Runnable {
    private volatile double investimento;
    private volatile double percentualCompra;
    private volatile double valorBTC;
    private volatile double percentualBTC;
    private volatile int qtdTransacoes = 0;
    private volatile int qtdTransacoesLimite;

    public Compra(double investimento, double percentualCompra, double valorBTC, double percentualBTC, int qtdTransacoesLimite) {
        this.investimento = investimento;
        this.percentualCompra = percentualCompra;
        this.valorBTC = valorBTC;
        this.percentualBTC = percentualBTC;
        this.qtdTransacoesLimite = qtdTransacoesLimite;
    }

    @Override
    public void run() {
        if(this.qtdTransacoes < this.qtdTransacoesLimite) {
            if(percentualBTC <= percentualCompra) {
                this.qtdTransacoes++;
                //calcular compra do BTC e guardar novo valor em 'investimento'
                System.out.println("Compra! Carteira: " + this.investimento);
            }
        }
    }

    public double getInvestimento() {
        return investimento;
    }

    public void setInvestimento(double investimento) {
        this.investimento = investimento;
    }

    public double getPercentualCompra() {
        return percentualCompra;
    }

    public void setPercentualCompra(double percentualCompra) {
        this.percentualCompra = percentualCompra;
    }

    public double getValorBTC() {
        return valorBTC;
    }

    public void setValorBTC(double valorBTC) {
        this.valorBTC = valorBTC;
    }

    public double getpercentualBTC() {
        return percentualBTC;
    }

    public void setpercentualBTC(double percentualBTC) {
        this.percentualBTC = percentualBTC;
    }

    public int getQtdTransacoesLimite() {
        return qtdTransacoes;
    }

    public void setQtdTransacoesLimite(int qtdTransacoes) {
        this.qtdTransacoes = qtdTransacoes;
    }
}

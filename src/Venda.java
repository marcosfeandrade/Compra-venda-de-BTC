public class Venda implements Runnable {
    private volatile double investimento;
    private volatile double percentualVenda;
    private volatile double valorBTC;
    private volatile double percentualBTC;
    private volatile int qtdTransacoes = 0;
    private volatile int qtdTransacoesLimite;

    public Venda (double investimento, double percentualVenda, double valorBTC, double percentualBTC, int qtdTransacoesLimite) {
        this.investimento = investimento;
        this.percentualVenda = percentualVenda;
        this.valorBTC = valorBTC;
        this.percentualBTC = percentualBTC;
        this.qtdTransacoesLimite = qtdTransacoesLimite;
    }

    @Override
    public void run() {
        if(this.qtdTransacoes < this.qtdTransacoesLimite) {
            if(percentualBTC >= percentualVenda) {
                this.qtdTransacoes++;
                //calcular venda do BTC e guardar novo valor em 'investimento'
                System.out.println("Venda! Carteira: " + this.investimento);
            }
        }
    }

    public double getInvestimento() {
        return investimento;
    }

    public void setInvestimento(double investimento) {
        this.investimento = investimento;
    }

    public double getPercentualVenda() {
        return percentualVenda;
    }

    public void setPercentualVenda(double percentualVenda) {
        this.percentualVenda = percentualVenda;
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
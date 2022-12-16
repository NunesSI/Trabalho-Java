public class ContaPoupanca extends Conta{
    private Double rentabilidade;

    public ContaPoupanca(String numero, Double valorCaixa, Double rentabilidade) {
        super(numero, valorCaixa);
        this.setRentabilidade(rentabilidade);
    }


    public Double calcularSaldo(ContaPoupanca conta){
        Double total = conta.getValorCaixa();


        for (Debito e : debito){
            total -= e.getValor();

        }
        for (Credito e : credito){
            total += e.getValor();
        }

        return total;
    }

    public Double getRentabilidade() {
        return rentabilidade;
    }

    public void setRentabilidade(Double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }
}

public class ContaPoupanca extends Conta{
    private Double rentavel;

    public ContaPoupanca(String numero, Double valorCaixa, Double rentavel) {
        super(numero, valorCaixa);
        this.setRentavel(rentavel);
    }

    public Double calcularSaldo(ContaPoupanca conta){
        Double total = conta.getValorCX();

        for (Debito e : debito){
            total -= e.getValor();

        }
        for (Credito e : credito){
            total += e.getValor();
        }
        return total;
    }
    public Double getRentavel() {
        return rentavel;
    }

    public void setRentavel(Double rentavel) {
        this.rentavel = rentavel;
    }
}

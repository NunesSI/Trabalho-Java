public class ContaCorrente extends Conta{
    private Double limite;

    public ContaCorrente(String numero, Double valorCaixa, Double limite) {
        super(numero, valorCaixa);
        this.setLimite(limite);
    }


    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Object trasferir(Conta contaEnviadora, Conta contaAlvo , Double valor){

        Object[] i = {contaEnviadora,contaAlvo};

        if(valor > contaEnviadora.getValorCaixa()){

            System.out.println("Conta de Numero " + contaEnviadora.getNumero() + " sem Saldo:");

            return  i;

        }

            contaAlvo.setValorCaixa(contaAlvo.getValorCaixa() + valor);
            contaEnviadora.setValorCaixa(contaEnviadora.getValorCaixa() - valor);


    return i;
    }

    public Double calcularSaldo(ContaCorrente conta){
        Double total = conta.getValorCaixa();

        for (Debito e : debito){
            total -= e.getValor();

        }
        for (Credito e : credito){
            total += e.getValor();
        }

        return total + limite;
    }


}

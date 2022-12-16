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

        if(valor > contaEnviadora.getValorCX()){

            System.out.println("Conta de Numero " + contaEnviadora.getNumero() + " sem Saldo:");

            return  i;

        }

            contaAlvo.setValorCX(contaAlvo.getValorCX() + valor);
            contaEnviadora.setValorCX(contaEnviadora.getValorCX() - valor);


    return i;
    }

    public Double calcularSaldo(ContaCorrente conta){
        Double total = conta.getValorCX();

        for (Debito e : debito){
            total -= e.getValor();

        }
        for (Credito e : credito){
            total += e.getValor();
        }

        return total + limite;
    }


}

import java.util.ArrayList;
import java.util.Collection;

public class Conta {
    private String numero;

    private Double valorCaixa;

    public Collection<Debito> debito = new ArrayList<Debito>();
    public Collection<Credito> credito = new ArrayList<Credito>();
    public Conta (String numero , Double valorCaixa){
        this.numero = numero;
        this.valorCaixa = valorCaixa;

    }

    public Double depositar(Credito valorDepositado){

        this.valorCaixa += valorDepositado.getValor();
        return this.valorCaixa;
    }

    public Double sacar(Debito valorSacado) {
        if (valorSacado.getValor() > this.valorCaixa) {

            System.out.println("Sem saldo para sacar " + numero);
            return this.valorCaixa;
        }

        this.valorCaixa -= valorSacado.getValor();

        return this.valorCaixa;
    }
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getValorCaixa() {
        return valorCaixa;
    }

    public void setValorCaixa(Double valorCaixa) {
        this.valorCaixa = valorCaixa;
    }
}

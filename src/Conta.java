import java.util.ArrayList;
import java.util.Collection;

public class Conta {
    private String numero;

    private Double valorCX;

    public Collection<Debito> debito = new ArrayList<Debito>();
    public Collection<Credito> credito = new ArrayList<Credito>();
    public Conta (String numero , Double valorCX){
        this.numero = numero;
        this.valorCX = valorCX;

    }

    public Double depositar(Credito valorDepositado){

        this.valorCX += valorDepositado.getValor();
        return this.valorCX;
    }

    public Double sacar(Debito valorSacado) {
        if (valorSacado.getValor() > this.valorCX) {

            System.out.println("Sem saldo para sacar " + numero);
            return this.valorCX;
        }

        this.valorCX -= valorSacado.getValor();

        return this.valorCX;
    }
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getValorCX() {
        return valorCX;
    }

    public void setValorCX(Double valorCX) {
        this.valorCX = valorCX;
    }
}

import java.util.ArrayList;
import java.util.Collection;

public class Cliente extends PessoaFisica implements IUser{

    private Boolean vip = true;
    public Collection<Endereco> listaEndereco = new ArrayList<Endereco>();
    public Collection<Conta> listaConta = new ArrayList<Conta>();

    public Cliente(String cpf, String nome, String telefone) {
        super(cpf, nome, telefone);
    }

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    public void printEndereco(Cliente e) {

        Collection<Endereco> enderecoCliente = e.listaEndereco;

        for (Endereco i : enderecoCliente) {

            System.out.println("O cliente " + e.getNome() + " Mora em " + i.getCidade() + " Tem o CEP: " + i.getCep());

        }
    }

    @Override
    public Boolean autenticar() {
        return true;
    }
}

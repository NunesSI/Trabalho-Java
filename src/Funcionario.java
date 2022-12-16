public class Funcionario extends PessoaFisica implements IUser{

    private Double salario;
    private FuncaoCargo FuncionarioCargo;

    public Funcionario(String cpf, String nome, String telefone, Double salario) {
        super(cpf, nome, telefone);
        this.setSalario(salario);
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public FuncaoCargo getFuncionarioCargo() {
        return FuncionarioCargo;
    }

    public void setFuncionarioCargo(FuncaoCargo funcionarioCargo) {
        this.FuncionarioCargo = funcionarioCargo;
    }

    @Override
    public Boolean autenticar() {
        return true;
    }
}

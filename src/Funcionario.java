public class Funcionario extends PessoaFisica implements IUser{

    private Double salario;
    private FuncaoCargo cargoFuncionario;

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

    public FuncaoCargo getCargoFuncionario() {
        return cargoFuncionario;
    }

    public void setCargoFuncionario(FuncaoCargo cargoFuncionario) {
        this.cargoFuncionario = cargoFuncionario;
    }

    @Override
    public Boolean autenticar() {
        return true;
    }
}

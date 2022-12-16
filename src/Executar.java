public class Executar {

    public static void main(String[] args) {

        Endereco e1 = new Endereco("95260-62","Campinas","Rua Halfed","Caixa","SP","69");

        Endereco e2 = new Endereco("26250-66","Natal","Rua de barro","Shopping","RN","600");

        Cliente c1 = new Cliente("910.262.052-34","Tales","99626034");
        c1.listaEndereco.add(e1);
        c1.listaEndereco.add(e2);

        c1.printEndereco(c1);

        FuncaoCargo gerente = new FuncaoCargo();

        gerente.setCargoNome("Gerente");

        FuncaoCargo atendente = new FuncaoCargo();

        atendente.setCargoNome("Atendente");

        Funcionario f1 = new Funcionario("774.435.601-00","Aurelio","984352410",1000.);
        f1.setFuncionarioCargo(atendente);

        Funcionario f2 = new Funcionario("690.984.630-22","Edgar","88764565",3000.);
        f2.setFuncionarioCargo(gerente);


        ContaCorrente corrente1 = new ContaCorrente("111", 1500. , 3000.);

        ContaPoupanca poupanca1 = new ContaPoupanca("741" , 1000., 0.05);

        corrente1.trasferir(corrente1,poupanca1,500.);

        System.out.println("Conta de numero: "+ corrente1.getNumero() + " tem o Saldo de: " + corrente1.calcularSaldo(corrente1));

        System.out.println("Conta de numero: "+ poupanca1.getNumero() + " tem o Saldo de: " + poupanca1.calcularSaldo(poupanca1));


        ContaCorrente corrente2 = new ContaCorrente("962", 0., 0.);

        Credito credito1 = new Credito(100.);
        Credito credito2 = new Credito(100.);
        corrente1.credito.add(credito1);
        corrente2.credito.add(credito2);

        Debito debito1 = new Debito(30.);
        corrente1.debito.add(debito1);

        corrente1.depositar(credito1);
        corrente2.depositar(credito2);
        corrente1.sacar(debito1);

        System.out.println("Conta de numero: " + corrente2.getNumero() + " tem o Saldo de: " + corrente2.calcularSaldo(corrente2));
        Cliente c2 =new Cliente("4412234234","Pedro","998432211");
        c2.listaConta.add(corrente1);
        c2.listaConta.add(poupanca1);
        c2.listaConta.add(corrente2);



    }
}

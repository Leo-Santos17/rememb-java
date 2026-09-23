public class Gerente extends Funcionario{
    Gerente(String name)
    {
        super(name, "Manager", 4000);
        System.out.println("Gerente criado");
    }

    @Override
    double bonificacaoTotal()
    {
        return this.salary*=1.20;
    }

    @Override
    double bonificacao() {
        return this.salary * 0.20;
    }
}

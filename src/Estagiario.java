public class Estagiario extends Funcionario{
    Estagiario(String name)
    {
        super(name, "Intern", 1400);
        System.out.println("Estagiario vagabundo");
    }

    @Override
    double bonificacaoTotal()
    {
        return this.salary * 1.05;
    }

    @Override
    double bonificacao() {
        return this.salary * 0.05;
    }
}

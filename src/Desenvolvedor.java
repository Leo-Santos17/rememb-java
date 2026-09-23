public class Desenvolvedor extends Funcionario{
    Desenvolvedor(String name)
    {
        super(name, "Developer", 2000);
        System.out.println("Desenvolvedor criado");
    }

    @Override
    double bonificacaoTotal()
    {
        return this.salary * 1.10;
    }

    @Override
    double bonificacao() {
        return this.salary * 0.10;
    }
}

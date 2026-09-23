public class Desenvolvedor extends Funcionario{
    Desenvolvedor(String name)
    {
        super();
        this.name = name;
        this.role = "Developer";
        this.salary = 2000;
        System.out.println("Desenvolvedor criado");
    }

    @Override
    double bonificacaoTotal()
    {
        return this.salary*=1.10;
    }

    @Override
    double bonificacao() {
        return this.salary * 0.10;
    }
}

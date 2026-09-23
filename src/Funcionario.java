public class Funcionario
{
    String name;
    double salary;
    String role;

    Funcionario()
    {
        System.out.println("Funcionario criado");
    }

    double bonificacaoTotal()
    {
        return salary*=1.00;
    }

    double bonificacao()
    {
        return salary * 1.00;
    }
}

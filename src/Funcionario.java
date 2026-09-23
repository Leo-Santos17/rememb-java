public class Funcionario
{
    String name;
    String role;
    double salary;

    Funcionario(String name, String role, double salary)
    {
        this.name = name;
        this.role = role;
        this.salary = salary;
        System.out.println("Funcionario criado");
    }

    double bonificacaoTotal()
    {
        return salary * 1.00;
    }

    double bonificacao()
    {
        return salary * 1.00;
    }
}

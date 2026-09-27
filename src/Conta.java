public class Conta
{
    String numero;
    String nome;
    double saldo;

    Conta(String numero, String nome, double saldo)
    {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }

    void depositar(double valor)
    {
        if(has_saldo(valor))
            this.saldo += valor;
    }

    void sacar(double valor)
    {
        if(has_saldo(valor))
            this.saldo -= valor;
    }

    private boolean has_saldo(double valor)
    {
        return this.saldo < valor? false : true;
    }
}

public class ContaPoupanca extends Conta{
    double taxaRendimento;

    ContaPoupanca(String numero, String nome, double saldo)
    {
        super(numero, nome, saldo);
        this.taxaRendimento = 1.25;
    }

    void aplicarRendimento()
    {
        this.saldo *= taxaRendimento;
    }

}

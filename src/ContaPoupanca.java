public class ContaPoupanca extends Conta{

    double taxaRendimento;

    ContaPoupanca(String nome, double saldo)
    {
        super(nome, saldo);
        this.tipo = "Poupança";
        this.taxaRendimento = 1.25;
        System.out.println("Conta Poupança criada");
    }

    @Override
    void aplicarRendimento()
    {
        System.out.println("Aplicando rendimento...");
        this.saldo *= this.taxaRendimento;
        System.out.println();
        System.out.println("Novo saldo: "+this.saldo);
    }

    @Override
    void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Taxa de rendimento: "+(taxaRendimento-1)*100+"%");
    }


}

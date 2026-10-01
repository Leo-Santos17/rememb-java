public class ContaCorrente extends Conta{

    double limite;

    ContaCorrente(String nome, double saldo)
    {
        super(nome, saldo);
        this.tipo = "Corrente";
        this.limite = 100;
        System.out.println("Conta corrente criada");
    }

    @Override
    void sacar(double valor) {
        if(this.saldo > valor+this.limite)
        {
            this.saldo -= valor;
            System.out.println();
            System.out.println("Foi sacado R$"+valor+" e o novo saldo é de R$"+this.saldo);
        }
    }

    @Override
    void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Limite: "+limite);
    }
}

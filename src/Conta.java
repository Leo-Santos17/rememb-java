import java.util.Random;

public class Conta
{
    String numero;
    String nome;
    String tipo;
    double saldo;

    private Random random = new Random();

    Conta(String nome, double saldo)
    {
        this.nome = nome;
        this.numero = String.valueOf(random.nextInt(1000,9999));
        this.saldo = saldo;
        System.out.println("----------------------");
        System.out.println("Conta criada");
    }

    void depositar(double valor)
    {
       this.saldo += valor;
       System.out.println("Foram depositados R$"+valor+". O novo saldo é de R$"+this.saldo);
    }

    void sacar(double valor)
    {
        if(this.saldo > valor)
        {
            this.saldo -= valor;
            System.out.println();
            System.out.println("Foi sacado R$"+valor+" e o novo saldo é de R$"+this.saldo);
        }
    }

    void mostrarInformacoes()
    {
        System.out.println();
        System.out.println("Nome: "+ this.nome + "\nTipo: "+ this.tipo+ "\nNúmero: "+this.numero+"\nSaldo: "+this.saldo);
    }

    void mostrarSaldo()
    {
        System.out.println();
        System.out.println("O saldo atual é: "+this.saldo);
    }
}

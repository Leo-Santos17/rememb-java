public class Main {
    public static void main(String[] args){
        Conta[] contas = {
                new ContaCorrente("Leonardo", 122),
                new ContaPoupanca("Leonardo", 5),
                new ContaCorrente("Victoria", 1610),
                new ContaPoupanca("Victoria", 422)
        };

        contas[1].mostrarInformacoes();
        contas[1].depositar(100);
        contas[1].sacar(200);
        rend(contas[1]);
        contas[2].depositar(1000);
        contas[0].depositar(3000);
        contas[0].sacar(124.25);
        contas[0].depositar(28);
        contas[3].depositar(10);
        rend(contas[3]);
        contas[0].mostrarInformacoes();
        contas[1].mostrarInformacoes();
        contas[2].mostrarInformacoes();
        contas[3].mostrarInformacoes();


    }

    static void rend(Conta cp)
    {
        ContaPoupanca contaPoupanca = (ContaPoupanca) cp;
        contaPoupanca.aplicarRendimento();
    }
}
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
    }
}
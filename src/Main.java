public class Main {
    public static void main(String[] args){

        Espaco[] espacos = {
            new Auditorio(3, "esa", 2),
            new Quadra(3, "Benedito", "Poliesportiva")
        };

        Espaco espaco = new Espaco();
        espaco.cadastroEspaco(espacos);

        espaco.mostrarEspaco();
        espaco.espacosDisponiveis();
        espaco.fazerReserva(espacos[1]);
        espaco.fazerReserva(espacos[1]);
        espaco.espacosDisponiveis();
        espaco.cancelarReserva(espacos[1]);
        espaco.mostrarEspaco();
        espaco.espacosDisponiveis();
    }
}
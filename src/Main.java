public class Main {
    public static void main(String[] args){

        Espaco[] espacos = {
            new Auditorio(3, "esa", 2),
            new Quadra(3, "Benedito", "Poliesportiva")
        };
        GerenciadorEspaco gerenciadorEspaco = new GerenciadorEspaco();
        gerenciadorEspaco.cadastroEspaco(espacos);
        gerenciadorEspaco.mostrarEspacosDisponiveis();
        gerenciadorEspaco.reservar();
        gerenciadorEspaco.reservar();
        gerenciadorEspaco.mostrarEspacosDisponiveis();
        gerenciadorEspaco.encerrar();
        gerenciadorEspaco.mostrarEspacosDisponiveis();
        gerenciadorEspaco.mostrarEspacosTodos();
    }
}
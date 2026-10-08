public class Main {
    public static void main(String[] args){

        Espaco[] espacos = {
            new Auditorio(3, "esa", 2),
            new Quadra(3, "Benedito", "Poliesportiva"),
            new Quadra(10, "Joesley", "Poliesportiva"),
            new Sala(10, "1B", 10),
            new Sala(20, "2B", 18)
        };

        Espaco espaco = new Espaco();
        espaco.set_stack(espacos);

        espaco.mostrarInformacoes();

    }
}
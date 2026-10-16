public class Sala extends Espaco{

    int mesas;

    Sala(int capacidade, String nome, int mesas) {
        super(capacidade, nome);
        this.mesas = mesas;
        System.out.println("Criado Sala");
    }

    @Override
    public void mostrarEspaco() {
        System.out.println("Nome: "+getNome()+"\n"+
                "Disponível: "+getDisponibilidade()+"\n"+
                "Capacidade: "+getCapacidade()+"\n"+
                "Tipo: "+this.toString()+"\n"+
                "Mesas: "+this.mesas);
    }
}

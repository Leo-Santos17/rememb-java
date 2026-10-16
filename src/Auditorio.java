public class Auditorio extends Espaco{

    int assentos;

    Auditorio(int capacidade, String nome, int assentos) {
        super(capacidade, nome);
        this.assentos = assentos;
    }

    @Override
    public void mostrarEspaco() {
        System.out.println("Nome: "+getNome()+"\n"+
                "Disponível: "+getDisponibilidade()+"\n"+
                "Capacidade: "+getCapacidade()+"\n"+
                "Tipo: "+this.toString()+"\n"+
                "Assentos: "+this.assentos);
    }

}

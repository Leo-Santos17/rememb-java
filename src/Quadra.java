public class Quadra extends Espaco
{
    String tipo;
    Quadra(int capacidade, String nome, String tipo) {
        super(capacidade, nome);
        this.tipo = tipo;
        System.out.println("Criado Quadra");
    }

    @Override
    public void mostrarEspaco() {
        System.out.println("Nome: "+getNome()+"\n"+
                "Disponível: "+getDisponibilidade()+"\n"+
                "Capacidade: "+getCapacidade()+"\n"+
                "Tipo: "+this.toString()+"\n"+
                "Modalidade: "+this.tipo);
    }
}

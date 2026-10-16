public class Espaco {
    final String nome;
    final int capacidade;
    private boolean disponibilidade;

    Espaco(int capacidade, String nome) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.disponibilidade = true;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean getDisponibilidade()
    {
        return this.disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    protected String texto() {
        return "Nome: "+this.getNome()+"\nCapacidade: "+this.getCapacidade()+"\nDisponibilidade: "+this.getDisponibilidade()+"\n";
    }

    public void mostrarEspaco()
    {}
}

public class Sala extends Espaco{

    int mesas;

    Sala(int capacidade, String nome, int mesas)
    {
        super(capacidade, nome);
        this.mesas = mesas;
        System.out.println("Criado Sala");
    }

    @Override
    public void mostrarEspaco()
    {
        System.out.println("Quadra");
        System.out.println(super.texto()+
                "Mesas: "+this.mesas);
    }
}

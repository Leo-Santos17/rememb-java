public class Auditorio extends Espaco{

    int assentos;

    Auditorio(int capacidade, String nome, int assentos) {
        super(capacidade, nome);
        this.assentos = assentos;
    }

    @Override
    public void mostrarEspaco()
    {
        System.out.println("Auditorio");
        System.out.println(super.texto()+
                "Assentos: "+this.assentos);
    }

}

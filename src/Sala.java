public class Sala extends Espaco{

    int mesas;

    Sala(int capacidade, String nome, int mesas) {
        super(capacidade, nome);
        this.mesas = mesas;
        setEspacos(this);
        System.out.println("Criado Sala");
    }

    public void setEspacos(Sala espaco) {
        Espaco[] temp = super.espacos;
        super.espacos = new Espaco[temp.length+1];
        for (int i = 0; i < super.espacos.length; i++) {
            System.out.println("Loop Sala: "+i);
            if(temp.length > i)
            {
                super.espacos[i] = temp[i];
            }
            else
            {
                super.espacos[i] = espaco;
            }
        }
    }
}

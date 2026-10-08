public class Quadra extends Espaco
{
    String tipo;
    Quadra(int capacidade, String nome, String tipo) {
        super(capacidade, nome);
        this.tipo = tipo;
        setEspacos(this);
        System.out.println("Criado Quadra");
    }

    public void setEspacos(Quadra espaco) {
        Espaco[] temp = super.espacos;
        super.espacos = new Espaco[temp.length+1];
        for (int i = 0; i < super.espacos.length; i++) {
            System.out.println("Loop Quadra: "+i);
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

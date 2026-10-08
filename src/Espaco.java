public class Espaco {
    String nome;
    int capacidade;
    boolean disponibilidade;
    Espaco[] espacos = {};

    Espaco(int capacidade, String nome) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.disponibilidade = true;
        System.out.println("Criado Espaço");
    }
    Espaco()
    {
        System.out.println("Objeto Vazio");
    }

    public void mostrarInformacoes()
    {
        System.out.println("Mostrando lista...");
        for(Espaco espaco: getEspacos())
        {
            System.out.println(espaco);
        }
    }

    public void set_stack(Espaco obj)
    {
        System.out.println("Set Espaco: "+this);
        Espaco[] temp = this.espacos;
        this.espacos = new Espaco[temp.length+1];
        for (int i = 0; i < this.espacos.length; i++)
        {
            if(temp.length > i)
            {
                this.espacos[i] = temp[i];
            }
            else
            {
                this.espacos[i] = obj;
            }
        }

    }

    public void set_stack(Espaco[] obj)
    {
        for(Espaco espaco : obj)
        {
            set_stack(espaco);
        }
    }

    public Espaco[] getEspacos() {
        return espacos;
    }

}

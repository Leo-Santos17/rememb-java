public class Espaco {
    private String nome;
    private int capacidade;
    private boolean disponibilidade;
    protected Espaco[] espacos = {};

    Espaco(int capacidade, String nome) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.disponibilidade = true;
    }
    Espaco() {}

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

    public void mostrarEspacos()
    {
        System.out.println("Listando espaços");
        for (Espaco espaco: espacos)
        {
            System.out.println("---------------------------");
            System.out.println(espaco.toString());
            System.out.println("Nome: "+espaco.nome);
            System.out.println("Capacidade: "+espaco.capacidade);
            System.out.println("---------------------------");
        }
    }

    public void mostrarEspaco()
    {
        System.out.println("Nenhum espaço selecionado");
    }

    public void cadastroEspaco(Espaco[] space)
    {
        for(Espaco espaco : space)
        {
            set_stack(espaco);
        }
    }

    private void set_stack(Espaco obj)
    {
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

    public void espacosDisponiveis()
    {
        System.out.println("************************");
        System.out.println("Espaços disponíveis");
        for(Espaco espaco: this.espacos)
        {
            if(espaco.disponibilidade)
            {
                System.out.println("---------------------------");
                System.out.println(espaco.toString());
                System.out.println("Nome: "+espaco.nome);
                System.out.println("Capacidade: "+espaco.capacidade);
                System.out.println("---------------------------");
            }

        }
    }

    public void fazerReserva(Espaco space) {
        for(Espaco espaco: this.espacos)
        {
            if(space.equals(espaco)) {
                if(espaco.disponibilidade)
                {
                    espaco.disponibilidade = false;
                    System.out.println("Espaço reservado");
                }
                else
                {
                    System.out.println("Este espaço já está reservado");
                }
                break;
            }
        }
        System.out.println("Esse espaço nem existe");
    }
    public void cancelarReserva(Espaco space)
    {
        for(Espaco espaco: this.espacos)
        {
            if(space.equals(espaco)) {
                if(!espaco.disponibilidade)
                {
                    espaco.disponibilidade = true;
                    System.out.println("Espaço Disponível");
                }
                else
                {
                    System.out.println("Este espaço não foi reservado");
                }
                break;
            }
        }
    }
}

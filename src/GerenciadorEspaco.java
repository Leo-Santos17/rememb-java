import java.util.Scanner;

public class GerenciadorEspaco {
    final Scanner scanner = new Scanner(System.in);
    private Espaco[] espacos = {};

    GerenciadorEspaco(){}

    public void mostrarEspacosDisponiveis()
    {
        boolean dispon = false;
        System.out.println("************************");
        System.out.println("Espaços disponíveis");

        for (Espaco espaco : this.espacos) {
            if (espaco.getDisponibilidade()) {
                list(espaco);
                dispon = true;
            }
        }
        if(!dispon)
        {
            System.out.println("Não há espaços disponíveis");
        }
        System.out.println();


    }

    public void mostrarEspacosTodos()
    {
        System.out.println("************************");
        System.out.println("Listando todos os espaços");
        for(Espaco espaco: this.espacos)
        {
            list(espaco);
        }
        System.out.println();
    }

    public void cadastroEspaco(Espaco[] space)
    {
        for(Espaco espaco : space)
        {
            set_stack(espaco);
        }
        System.out.println();
    }

    public void reservar()
    {
        System.out.println("Sistema de reservas");
        for (int i = 0; i < this.espacos.length; i++) {
            System.out.println("["+i+"] "+ this.espacos[i].toString().substring(0, this.espacos[i].toString().indexOf("@")) +" "+this.espacos[i].getNome()+" "+(this.espacos[i].getDisponibilidade()?"":"(Reservado)"));
        }
        System.out.print("Qual espaco deseja alugar? (Insira a partir de número associado): ");
        fazerReserva(scanner.nextInt());
        System.out.println();
    }

    public void encerrar()
    {
        for (int i = 0; i < this.espacos.length; i++)
        {
            if(!this.espacos[i].getDisponibilidade())
            {
                System.out.println("[" + i + "] " + this.espacos[i].getClass().getSimpleName() + " " + this.espacos[i].getNome());
            }
        }
        System.out.print("Qual espaco deseja desalugar? (Insira a partir de número associado): ");
        cancelarReserva(scanner.nextInt());
        System.out.println();
    }

    private void cancelarReserva(int index)
    {
        try {
            if(!espacos[index].getDisponibilidade())
            {
                espacos[index].setDisponibilidade(true);
                System.out.println("Espaço agora disponível");
            }
            else
            {
                System.out.println("Espaço nunca foi reservado");
            }
        } catch (Exception e) {
            System.out.println("Posição inválida");
        }
    }

    private void fazerReserva(int index) {
        try
        {
            if(espacos[index].getDisponibilidade())
            {
                espacos[index].setDisponibilidade(false);
                System.out.println("Espaço foi reservado");
            }
            else
            {
                System.out.println("Espaço já está reservado");
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Posição Inválida");
        }
        catch (Exception e)
        {
            System.out.println("Erro: "+e);
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

    private void list(Espaco espaco)
    {
        espaco.mostrarEspaco();
        System.out.println("-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-");
    }

}

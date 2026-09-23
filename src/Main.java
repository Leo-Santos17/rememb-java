public class Main {
    public static void main(String[] args){
        Funcionario[] lista = {new Desenvolvedor("Jorge"),
        new Gerente("Gaynilson"),
        new Estagiario("Fernando"),
        new Gerente("Viadilson"),
        new Desenvolvedor("Chad")};

        // Reader lista
        for(Funcionario func : lista)
        {
            System.out.println(func.name);
            System.out.println(func.role);
            System.out.println(func.salary);
            System.out.println("_--_--_--_--_--_--_--_--_--_--_--_--");
        }

        // Bonus lista
        System.out.println("------------------------------------------------------------------------------------");
        for(Funcionario func : lista)
        {
            System.out.println(func.name);
            System.out.println(func.role);
            System.out.println(func.salary);
            System.out.println(func.bonificacao());
            System.out.println(func.bonificacaoTotal());
            System.out.println("_--_--_--_--_--_--_--_--_--_--_--_--");
        }


    }
}
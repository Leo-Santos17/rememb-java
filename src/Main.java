public class Main {
    public static void main(String[] args){
        Funcionario[] lista = {new Desenvolvedor("Jorge"),
        new Gerente("Gaynilson"),
        new Estagiario("Fernando"),
        new Gerente("Viadilson"),
        new Desenvolvedor("Chad")};

        // Reader lista
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("                        Lista de funcionários");
        for(Funcionario func : lista)
        {
            System.out.println("Nome: "+func.name);
            System.out.println("Cargo: "+func.role);
            System.out.println("Salário: R$"+func.salary);
            System.out.println("_--_--_--_--_--_--_--_--_--_--_--_--");
        }

        // Bonus lista
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("                            Pagamento");
        for(Funcionario func : lista)
        {
            System.out.println("Nome: "+func.name);
            System.out.println("Cargo: "+func.role);
            System.out.println("Salário: R$"+func.salary);
            System.out.println("Bonificação: R$"+func.bonificacao());
            System.out.println("Salário + Bonificação: R$"+func.bonificacaoTotal());
            System.out.println("_--_--_--_--_--_--_--_--_--_--_--_--");
        }


    }
}
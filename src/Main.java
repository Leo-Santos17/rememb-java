public class Main {
    public static void main(String[] args){
        Produto[] produtos = {
                new Produto("Mouse", 9.43, 3),
                new Produto("Teclado", 12, 2),
                new Produto("Monitor", 400, 1),
        };

        Cliente cl1 = new Cliente("Leo");

        cl1.adicionarProduto(produtos);
        cl1.mostrarInformacoes();
        cl1.removerProduto("Teclado");
        cl1.mostrarInformacoes();
    }
}
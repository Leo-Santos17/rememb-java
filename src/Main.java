public class Main {
    public static void main(String[] args){
        Produto[] produtos = {
                new Produto("Mouse"),
                new Produto("Teclado"),
                new Produto("Monitor")
        };

        Cliente cl1 = new Cliente("Leo");
        cl1.adicionarProdutos(produtos);
        cl1.mostrarInformacoes();
    }
}
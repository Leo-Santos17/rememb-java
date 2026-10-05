public class Cliente
{
    private String name;
    private Carrinho carrinho = new Carrinho();

    Cliente(String name)
    {
        this.name = name;
    }

    void adicionarProduto(Produto produto)
    {
        carrinho.setProdutos(produto);
    }

    void adicionarProdutos(Produto[] produtos)
    {
        carrinho.setProdutos(produtos);
    }

    void mostrarInformacoes()
    {
        double preco = 0;
        System.out.println("Cliente: "+this.name);
        System.out.println();
        System.out.println("-----Carrinho-----");
        for (Produto produto : this.carrinho.getProdutos())
        {
            System.out.println(produto.nome+", "+produto.preco);
            preco += produto.preco;
        }
        System.out.println();
        System.out.println("Total: R$ "+preco);
    }
}

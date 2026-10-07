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
        this.carrinho.setProdutos(produto);
    }
    void adicionarProduto(Produto[] produtos)
    {
        for(Produto produto: produtos)
        {
            this.carrinho.setProdutos(produto);
        }
    }

    void mostrarInformacoes()
    {
        double preco = 0;
        System.out.println("Cliente: "+this.name);
        System.out.println();
        System.out.println("-----Carrinho-----");
        for (Produto produto : this.carrinho.getProdutos())
        {
            System.out.println(produto.nome+", "+produto.preco+" x "+produto.quantidade);
            preco += (produto.preco*produto.quantidade);
        }
        System.out.println();
        System.out.println("Total: R$ "+preco);
    }

    void removerProduto(String name)
    {
        carrinho.remove_stack(name);
    }
}

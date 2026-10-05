public class Carrinho{
    private Produto [] produtos = {};

    Carrinho(){}

    public Produto[] getProdutos() {
        return this.produtos;
    }

    public void setProdutos(Produto produto) {
        set_stack(produto);
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    private void set_stack(Produto produto)
    {
        Produto[] produto_temp = this.produtos;
        produtos = new Produto[produtos.length+1];
        System.out.println(produtos.length);
        for(int i = 0; i < produtos.length; i++)
        {
            if(produto_temp.length > i)
            {
                produtos[i] = produto_temp[i];
                System.out.println("Entrada array antigo: "+produto_temp[i]);
            }
            else
            {
                produtos[i] = produto;
                System.out.println("Entrada array novo: "+produto);
            }
        }
    }
}
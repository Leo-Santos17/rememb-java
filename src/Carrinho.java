public class Carrinho{
    private Produto [] produtos = {};

    Carrinho(){}

    public Produto[] getProdutos()
    {
        return this.produtos;
    }

    public void setProdutos(Produto produto)
    {
        set_stack(produto);
    }

    private void set_stack(Produto produto)
    {
        Produto[] produto_temp = this.produtos;
        if(!repeat(produto.nome))
        {
            produtos = new Produto[produtos.length+1];

            for (int i = 0; i < produtos.length; i++) {
                if (produto_temp.length > i) {
                    produtos[i] = produto_temp[i];
                    System.out.println("Entrada array antigo: " + produto_temp[i]);
                } else {
                    produtos[i] = produto;
                    System.out.println("Entrada array novo: " + produto);
                }
            }
        }
    }

    private boolean repeat(String nome)
    {
        if(this.produtos.length > 0)
        {
            for (Produto produto : this.produtos)
            {
                if (produto.nome.toLowerCase().equals(nome.toLowerCase()))
                {
                    System.out.println("Produto repetido");
                    return true;
                }
            }
            return false;
        }
        else
        {
            return false;
        }
    }

    protected void remove_stack(String name)
    {
        if(repeat(name)){
            for (int i = 0; i < this.produtos.length; i++) {
                if (this.produtos[i].nome.toLowerCase().equals(name.toLowerCase())) {
                    System.out.println("Removendo " + this.produtos[i].nome);
                    this.produtos[i] = null;
                    break;
                }
            }

            sort_stack();
        }
        else
        {
            System.out.println("Valor não encontrado");
        }
    }

    private void sort_stack()
    {
        Produto[] temp = new Produto[this.produtos.length-1];
        int count = 0;
        for (int i = 0; i < this.produtos.length; i++) {
            if(this.produtos[i] != null)
            {
                temp[count] = this.produtos[i];
                count++;
            }
        }

        this.produtos = temp;
    }
}
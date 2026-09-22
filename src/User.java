public class User extends Library{
    String name;
    Book[] lentBooks;

    User(String name)
    {
        this.name = name;
        this.lentBooks = new Book[0];
    }

    void alugarLivro(Book book)
    {
        if(temLivroDisponivel(book))
        {
            Book[] temp = lentBooks;
            this.lentBooks = new Book[lentBooks.length + 1];
            for (int i = 0; i < temp.length; i++) {
                this.lentBooks[i] = temp[i];
            }
            this.lentBooks[lentBooks.length - 1] = book;
            statusLivro(book);
            atribuirUsuario(book, this);
            System.out.println("------------------------------------------");
            System.out.println("            Livro Emprestado");
            System.out.println(book.name);
            System.out.println("------------------------------------------");
        }
        else
        {
            System.out.println("------------------------------------------");
            System.out.println("        Este livro foi emprestado");
            System.out.println(book.name);
            System.out.println("------------------------------------------");

        }
    }

    void devolverTodos()
    {
        Book[] temp = this.lentBooks;
        for(Book book:this.lentBooks)
        {
            devolverLivro(book);
        }
        this.lentBooks = new Book[0];
    }

    void devolver(Book book)
    {

        if(!temLivroDisponivel(book))
        {
            int count = 0;
            Book[] bookTemp;
            for (Book sel : this.lentBooks) {
                if (sel == book) {
                    devolverLivro(book);
                }
            }
            for (int i = 0; i < this.lentBooks.length; i++) {
                if (this.lentBooks[i] == book) {

                    this.lentBooks[i] = null;

                    for (Book sel : this.lentBooks) {
                        if (sel != null) {
                            bookTemp = new Book[count + 1];
                            bookTemp[count] = sel;
                            count++;
                            this.lentBooks = bookTemp;
                        }
                    }
                }
            }
        }
        else
        {
            System.out.println("Você não possui este livro");
        }
    }

}

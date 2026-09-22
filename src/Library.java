public class Library{
    static Book[] estante;

    Library(){}

    void statusLivro(Book book) { book.isAvailable = !book.isAvailable; }

    void atribuirUsuario(Book book, User user) { book.person = user;}

    void devolverLivro(Book book)
    {
        book.isAvailable = true;
    }

    void verificarTodosLivros()
    {
        System.out.println("---------------------------------------------------------");
        for(Book book: this.estante)
        {
            System.out.print(book.name+" - "+(book.isAvailable?"Disponível": "Emprestado")+(!book.isAvailable? " - "+book.person.name:""));
            System.out.println();
        }
        System.out.println("---------------------------------------------------------");
    }

    void verificarTodosLivros(Book[] books)
    {
        for(Book book: books)
        {
            System.out.print(book.name+" - "+(book.isAvailable?"Disponível": "Emprestado"));
            System.out.println();
        }
    }

    void colocarLivrosEstante(Book[] books)
    {
        this.estante = books;
    }

    void checarLivrosAlugados()
    {
        System.out.println("------------------");
        System.out.println("Livros emprestados:");
        System.out.println();
        for(Book book: this.estante)
        {
            if (!book.isAvailable) {
                System.out.println(book.name);
            }
        }
        System.out.println("------------------");
    }

    void checarLivrosDisponiveis()
    {
        System.out.println("------------------");
        System.out.println("Livros disponíveis");
        System.out.println();
        for(Book book: this.estante)
        {
            if (book.isAvailable) {
                System.out.println(book.name);
            }
        }
        System.out.println("------------------");
    }
    
    boolean temLivroDisponivel(Book book)
    {
        for(Book sel: this.estante)
        {
            if(book == sel && sel.isAvailable)
            {
                return true;
            }
        }
        return false;
    }

    void checarLivrosUser(User user)
    {
        System.out.println("-=-==--=-=-=-=-=-=-=-=-=-=-=-==---");
        System.out.println("    "+user.name);
        for(Book book : user.lentBooks)
        {
            System.out.println(book);
        }
        System.out.println("-=-==--=-=-=-=-=-=-=-=-=-=-=-==---");
    }

}

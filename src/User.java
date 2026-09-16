public class User {
    String name;
    static Book[] books = new Book[0];

    User(String name)
    {
        this.name = name;
    }

    public static void getLivro()
    {
        for(Book book:books)
        {
            System.out.println(book.name);
        }

    }

    static public Book[] getBooks()
    {
        return books;
    }

    public static void setBooks(Book book) {
        if(book.isAvailable)
        {
            Book[] book_temp = books;
            book.isAvailable = false;
            books = new Book[books.length + 1];
            for (int i = 0; i < books.length; i++) {
                if (i < book_temp.length) {
                    books[i] = book_temp[i];
                } else {
                    books[i] = book;
                }
            }
            System.out.println("Livro adicionado: "+book.name);
        }
        else
        {
            System.out.println("Opa! Este livro já foi emprestado, volte em outro momento ou escolha outros disponíveis");
            for (Book booka : getBooks())
            {
                if(booka.isAvailable)
                    System.out.println(booka.name+"\n*********************");
            }
        }
    }

}

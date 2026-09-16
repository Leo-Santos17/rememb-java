public class Library{
    Book[] estante;

    Library(){}

    void getLentBook()
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
    void getAvailableBook()
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

    void lentBook(Book book)
    {
        book.isAvailable = false;
    }

    void switchAvailable(Book book)
    {
        book.isAvailable = !book.isAvailable;
    }

    Book[] getBooks()
    {
        return estante;
    }
    void readAll()
    {
        for(Book book: this.estante)
        {
            System.out.print(book.name+" - "+(book.isAvailable?"Disponível": "Emprestado"));
            System.out.println();
        }
    }
//    boolean getStatus(Book book)
//    {
//
//    }
    void setBooks(Book[] books)
    {
        this.estante = books;
    }
}

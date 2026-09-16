public class Library{
    static int numOfBooks;
    static int numOfBooksAvailable;
    Library(){}

    public int available_books(Book[] books)
    {
        for(Book book : books)
        {
            if(book.isAvailable)
            {
                System.out.println(book.name);
                numOfBooksAvailable++;
            }
        }
        System.out.println("*********");
        System.out.println("O número de livros disponíveis: "+numOfBooksAvailable);
        return numOfBooksAvailable;
    }
}

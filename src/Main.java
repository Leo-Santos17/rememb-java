public class Main {
    public static void main(String[] args){
        // Lib System
        Book[] books = {
            new Book("Sex with hitler 1"),
            new Book("Sex with hitler 2"),
            new Book("Sex with hitler 3")
        };
        Library biblioteca = new Library();
        biblioteca.setBooks(books);
        System.out.println(biblioteca.getBooks());
        biblioteca.readAll();
        biblioteca.lentBook(books[1]);
        biblioteca.getLentBook();
        biblioteca.getAvailableBook();
    }
}
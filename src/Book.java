public class Book extends Library{
    String name;
    boolean isAvailable;

    Book(String name)
    {
        this.name = name;
        this.isAvailable = true;
        numOfBooks++;
    }

    public boolean switchAvailable(Book book)
    {
        return !book.isAvailable;
    }

}
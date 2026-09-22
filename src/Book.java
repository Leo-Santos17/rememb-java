public class Book extends Library
{
    String name;
    boolean isAvailable;
    User person;

    Book(String name)
    {
        this.name = name;
        this.isAvailable = true;
    }
}

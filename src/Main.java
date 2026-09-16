public class Main {
    public static void main(String[] args){
        // Lib System
        Book book1 = new Book("Sex Gay: batalha das espadas");
        Book book2 = new Book("Manual didático: criando uma mp5");
        Book book3 = new Book("Livro amarelo box completo");
        User user = new User("Gustavo");
        user.setBooks(book3);
        user.setBooks(book2);
        user.setBooks(book2);
        user.setBooks(book1);
    }
}
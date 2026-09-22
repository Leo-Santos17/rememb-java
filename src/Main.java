public class Main {
    public static void main(String[] args){
        // Lib System
        Book[] books = {
            new Book("Livro 1"),
            new Book("Livro 2"),
            new Book("Livro 3")
        };
        Book[] books1 = {
            new Book("Livro 4"),
            new Book("Livro 5"),
        };


        User user1 = new User("user1");
        User user2 = new User("user2");
        Library biblioteca = new Library();
        Library bib = new Library();
        bib.colocarLivrosEstante(books1);
        biblioteca.colocarLivrosEstante(books);
        biblioteca.checarLivrosDisponiveis();
        user1.alugarLivro(books[1]);
        biblioteca.checarLivrosDisponiveis();
        biblioteca.checarLivrosAlugados();
        biblioteca.verificarTodosLivros();
        user2.alugarLivro(books[2]);
        user2.alugarLivro(books[1]);

        biblioteca.checarLivrosUser(user1);
        System.out.println(user1);
        System.out.println(user2);



    }
}
public class App {

    public static void main() {

        Author author1 = new Author("Лев", "Николаевич", "Толстой");
        //Author author2 = new Author("Лев", "Николаевич", "Толстой");
        Author author2 = new Author("Генрик", "Пиус", "Сенкевич");
        Book book1 = new Book("Война и мир", author1, 1869);
        Book book2 = new Book("Огнём и мечом", author2, 1884);
 /*       System.out.println("author1.getFirstName() = " + author1.getFirstName());
        System.out.println("author2.getLastName() = " + author2.getLastName());
        System.out.println("book1.getNameBook() = " + book1.getNameBook());
        System.out.println("book2.author.getLastName() = " + book2.author.getLastName());
        book1.setYear(1890);
        System.out.println("Изменённый год: " + book1.getYear());*/

        AuthorService authorService = new AuthorService();

        System.out.println("authorService.equalsAuthor(author1, author2) = " + authorService.equalsAuthor(author1, author2));
        System.out.println("authorService.toString(author1) = " + authorService.toString(author1));
        System.out.println("authorService.hashCode(author1) = " + authorService.hashCode(author1));

        BookService bookService = new BookService();

        System.out.println("bookService.bookToString(book1) = " + bookService.bookToString(book1));
        System.out.println("bookService.equalsBooks(book1, book2) = " + bookService.equalsBooks(book1, book2));
        System.out.println("bookService.hashCode(book1) = " + bookService.hashCode(book1));


    }
}

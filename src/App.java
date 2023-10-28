public class App {

    public static void main() {

        Author author1 = new Author("Лев", "Николаевич", "Толстой");
        Author author2 = new Author("Генрик", "Пиус", "Сенкевич");
        Book book1 = new Book("Война и мир", author1, 1869);
        Book book2 = new Book("Огнём и мечом", author2, 1884);

        System.out.println("authorService.equalsAuthor(author1, author2) = " + author1.equals(author1, author2));
        System.out.println("authorService.toString(author1) = " + author1.toString());
        System.out.println("authorService.hashCode(author1) = " + author1.hashCode());

        System.out.println("bookService.bookToString(book1) = " + book1.toString());
        System.out.println("bookService.equalsBooks(book1, book2) = " + book1.equals(book2));
        System.out.println("bookService.hashCode(book1) = " + book1.hashCode());



    }
}

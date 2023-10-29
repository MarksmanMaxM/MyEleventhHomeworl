public class App {

    public static void main() {

        Author author1 = new Author("Лев", "Николаевич", "Толстой");
        Author author2 = new Author("Генрик", "Пиус", "Сенкевич");
        Book book1 = new Book("Война и мир", author1, 1869);
        Book book2 = new Book("Огнём и мечом", author2, 1884);

        System.out.println("equals(author1, author2) = " + author1.equals(author2));
        System.out.println("author.toString(author1) = " + author1.toString());
        System.out.println("author.hashCode(author1) = " + author1.hashCode());

        System.out.println("book.toString(book1) = " + book1.toString());
        System.out.println("book.equals(book2) = " + book1.equals(book2));
        System.out.println("book.hashCode(book1) = " + book1.hashCode());



    }
}

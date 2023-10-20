public class App {
    public static void main() {

        Book book1 = new Book("Война и мир", "Л.Толстой", 1869);
        Book book2 = new Book("Огнём и мечом", "Г.Сенкевич", 1884);

        Author author1 = new Author("Лев", "Николаевич", "Толстой");
        Author author2 = new Author("Генрик", "Пиус", "Сенкевич");

        System.out.println("author1.getFirstName() = " + author1.getFirstName());
        System.out.println("author2.getLastName() = " + author2.getLastName());
        System.out.println("book1.getNameBook() = " + book1.getNameBook());
        System.out.println("book2.getAuthor() = " + book2.getAuthor());

        book1.setYear(1890);
        System.out.println("Изменённый год: " + book1.getYear());

    }

}

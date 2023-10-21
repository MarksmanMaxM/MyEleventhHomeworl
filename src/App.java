public class App {
    public static void main() {


        Author author1 = new Author("Лев", "Николаевич", "Толстой");
        Author author2 = new Author("Генрик", "Пиус", "Сенкевич");


        Book book1 = new Book("Война и мир", author1, 1869);
        Book book2 = new Book("Огнём и мечом", author2, 1884);


        System.out.println("author1.getFirstName() = " + author1.getFirstName());
        System.out.println("author2.getLastName() = " + author2.getLastName());
        System.out.println("book1.getNameBook() = " + book1.getNameBook());
        System.out.println("book2.author.getLastName() = " + book2.author.getLastName());

        book1.setYear(1890);
        System.out.println("Изменённый год: " + book1.getYear());

    }

}

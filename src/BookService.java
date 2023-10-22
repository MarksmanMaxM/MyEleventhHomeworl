public class BookService {

    public String bookToString(Book book) {
        AuthorService authorService = new AuthorService();
        String bookToStr = book.getNameBook() + " " + authorService.toString(book.getAuthor()) + " " + Integer.toString(book.getYear());
        return bookToStr;
    }

    public boolean equalsBooks(Book book1, Book book2) {
        AuthorService authorService = new AuthorService();
        if (book1.getYear() == book2.getYear() &&
                book1.getNameBook().equals(book2.getNameBook()) &&
                authorService.equalsAuthor(book1.getAuthor(), book2.getAuthor())) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode(Book book) {
        AuthorService authorService = new AuthorService();
        int var = 0;
        var += book.getYear();
        var += book.getNameBook().length();
        var += authorService.hashCode(book.getAuthor());
        return  var;
    }
}

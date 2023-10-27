public class Book {
    private String nameBook;
    private Author author;
    private int year;

    public Book(String nameBook, Author author, int year) {
        this.nameBook = nameBook;
        this.author = author;
        this.year = year;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public String bookToString() {
        String bookToStr = this.getNameBook() + " " + author.toString() + " " + Integer.toString(this.getYear());
        return bookToStr;
    }

    public boolean equalsBooks(Book book1) {

        if (book1.getYear() == this.getYear() &&
                book1.getNameBook().equals(this.getNameBook()) &&
                author.equalsAuthor(book1.getAuthor(), this.getAuthor())) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        int var = 0;
        var += this.getYear();
        var += this.getNameBook().length();
        var += author.hashCode();
        return var;
    }
}

import java.util.Objects;

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

    public String toString() {
        String bookToStr = this.getNameBook() + " " + author.toString() + " " + Integer.toString(this.getYear());
        return bookToStr;
    }

    public boolean equals(Object book1) {

        if (this.getClass() != book1.getClass()) {
            return false;
        }

        Book bk1 = (Book) book1;

        if (bk1.getYear() == this.getYear() &&
                bk1.getNameBook().equals(this.getNameBook()) &&
                author.equals(bk1.getAuthor())) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (Objects.hashCode(this.getYear()) * Objects.hashCode(this.getNameBook()) * Objects.hashCode(author.hashCode()));

    }
}

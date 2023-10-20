public class Book {
    private String nameBook;
    private String author;
    private int year;

    public Book(String nameBook, String author, int year) {
        this.nameBook = nameBook;
        this.author = author;
        this.year = year;
    }


    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }


}

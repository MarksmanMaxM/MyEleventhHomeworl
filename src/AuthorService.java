public class AuthorService {

    public String toString(Author author) {
        String authorToString = author.getFirstName() + " " + author.getMiddleName() + " " + author.getLastName();
        return authorToString;
    }

    public boolean equalsAuthor(Author author1, Author author2) {
        if (author1.getFirstName().equals(author2.getFirstName()) &&
                author1.getMiddleName().equals(author2.getMiddleName()) &&
                author1.getLastName().equals(author2.getLastName())) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode(Author author) {
        int var = 0;
        var += author.getFirstName().length();
        var += author.getMiddleName().length();
        var += author.getLastName().length();
        return var;
    }


}

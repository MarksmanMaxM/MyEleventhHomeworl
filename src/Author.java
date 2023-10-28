import java.util.Objects;

public class Author {
    private String firstName;
    private String middleName;
    private String lastName;

    public Author(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getFirstName() {
        return this.firstName;
    }


    public String toString() {
        String authorToString = this.getFirstName() + " " + this.getMiddleName() + " " + this.getLastName();
        return authorToString;
    }

    public boolean equals(Author author1, Author author2) {
        if (author1.getFirstName().equals(author2.getFirstName()) &&
                author1.getMiddleName().equals(author2.getMiddleName()) &&
                author1.getLastName().equals(author2.getLastName())) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (Objects.hashCode(this.getFirstName()) * Objects.hashCode(this.getMiddleName()) * Objects.hashCode(this.getLastName()));

    }
}

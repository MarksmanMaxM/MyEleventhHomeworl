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

    public boolean equals(Object author2) {

        if(this.getClass() != author2.getClass())
        {
            return false;
        }

        Author au2 = (Author) author2;

        if (this.getFirstName().equals(au2.getFirstName()) &&
                this.getMiddleName().equals(au2.getMiddleName()) &&
                this.getLastName().equals(au2.getLastName())) {
            return true;
        } else {
            return false;
        }
    }


    public int hashCode() {
        return (Objects.hashCode(this.getFirstName()) * Objects.hashCode(this.getMiddleName()) * Objects.hashCode(this.getLastName()));

    }



}

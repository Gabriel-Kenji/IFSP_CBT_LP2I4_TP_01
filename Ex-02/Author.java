//Gabriel Kenji Utiyama CB3012069
public class Author {
    protected String name;
    protected String email;
    protected char gender;


    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email ;
        this.gender = gender;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public char getGender() {
        return this.gender;
    }


    public String toString(){

        return "Author[ name=" + this.getName() + ", email=" + this.getEmail() + ", gender=" +this.getGender()+ " ]";
    }
}

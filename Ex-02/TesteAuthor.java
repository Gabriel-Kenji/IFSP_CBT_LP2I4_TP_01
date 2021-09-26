//Gabriel Kenji Utiyama CB3012069
public class TesteAuthor  {
    public static void main(String[] args) {
            
        Author autor = new Author("Dan Brown", "dan.brown@hotmail.com", 'm');

        System.out.println("Autor: "+ autor.getName());
        System.out.println("E-mail: "+ autor.getEmail());
        System.out.println("Gender: "+ autor.getGender());
        autor.setEmail("brown.dan@hotmail.com");
        System.out.println(autor.toString());
    }
        
}

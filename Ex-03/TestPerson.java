//Gabriel Kenji Utiyama CB3012069
public class TestPerson {
    public static void main(String[] args) {
            
        Person p = new Person("aa","bb");

        System.out.println("Autor: "+ p.getName());
        System.out.println("Autor: "+ p.getAddress());
        p.setAddress("brown.dan@hotmail.com");
        System.out.println(p.toString());
    }
}

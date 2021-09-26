//Gabriel Kenji Utiyama CB3012069
public class TestBook {

    public static void main(String[] args) {

        Author[] authors = new Author[2] ;

        

        
        authors[0] = new Author("Autor 01", "autor01@somewhere.com.br", 'm');
        authors[1] = new Author("Autor 02", "autor02@nowhere.com.br", 'm');
        Book book1 = new Book("Java for Dummy", authors, 0);
        System.out.println( "\n" + book1 + "\n");
        book1.setPrice(19.99);
        book1.setQty(99);
        System.out.println( book1 + "\n");

        System.out.println("Autor: "+ book1.getName());
        System.out.println("Autor: "+ book1.getAuthorName());
        System.out.println("Price: "+ book1.getPrice());
        System.out.println("Qty: "+ book1.getQty());

        Book book2 = new Book("Java for Dummy 02", authors, 20 , 100);
        System.out.println( "\n" + book2 + "\n");
    }
   
}
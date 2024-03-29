//Gabriel Kenji Utiyama CB3012069
import java.util.Arrays;

public class Book {
	
	private String name;
	private Author[] author;
	private double price;
	private int qty = 0;

	public Book (String name, Author author[], double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public Book (String name, Author author[], double price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	public String getName() {
			return this.name;
	}
	public Author[] getAuthor() {
		return this.author;
	}
	public double getPrice() {
		return this.price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return this.qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String toString() {
		return "Book[name="+ name +", authors={"+ Arrays.toString(author) +"}, price="+ price+", qty="+qty+"]";
	}

	public String getAuthorName(){
		int contador = 0;
		for (int i = 0; i < this.author.length; i++){
			if(this.author[i]!=null){
			 contador++;
			}
		}
		String name = "";
		for (int i = 0; i < contador; i++){
			if(i == 0){
				name = this.author[i].getName(); 
			}else{
				name = name + ", " + this.author[i].getName(); 
			}
		}
		return name;
	}

    
}

package encapsulation_and_abstration;

class Author{
	public String name;
	public String email;
	public char gender;
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	

}

class Book{
	String name;
	Author author;
	Double price;
	int qntInStock;
	
	public Book(String name,Double price, int qntInStock) {
		this.name = name;
		this.author = new Author("Rahul","malirahul",'m');
		this.price = price;
		this.qntInStock = qntInStock;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getQntInStock() {
		return qntInStock;
	}
	public void setQntInStock(int qntInStock) {
		this.qntInStock = qntInStock;
	}
	@Override
	public String toString() {
		return "BOOK \nName=" + name + "\nAuthor=" +author.name +"\nEmail="+author.email+"\nGender="+author.gender+ "\nPrice=" + price + "\nqntInStock=" + qntInStock ;
	}
}



public class Main{
	public static void main(String[] args) {
		
		Book b = new Book("Java",475.0,3);
		System.out.println(b.toString());
	}
}

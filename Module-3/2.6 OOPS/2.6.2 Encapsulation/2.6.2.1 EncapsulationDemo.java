package fundamentals;
class BookDetails
{
	public int bookid;
	private String author;
	public int pages;
	public double price;
	public String bname;
        //generating getter and setter methods of all attributes
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
	BookDetails b=new BookDetails();

       //setting values
	b.setBookid(11);
	b.setBname("C programming");
	
        //getting values
	System.out.println("Book id:"+b.getBookid());

	}

}

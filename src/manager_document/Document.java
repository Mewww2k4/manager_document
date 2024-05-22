package manager_document;
import java.util.Scanner;
public abstract class Document implements IDocument {
       protected String id,title,namePublisher, author, typeDoc,language;
       protected double  quantity;
       protected int numRelease, yearPublish;
       protected double price ;
       
   	public Document() {
		super();
		this.id = " ";
		this.title = " ";
		this.namePublisher = " ";
		this.author = " ";
		this.typeDoc = " ";
		this.language = " ";
		this.numRelease = 0;
		this.yearPublish = 0;
		this.quantity = 0;
		this.price = 0;
	}
	public Document(String id, String title, String namePublisher, String author, String typeDoc, String language,
			int numRelease, int yearPublish, double quantity, double price) {
		super();
		this.id = id;
		this.title = title;
		this.namePublisher = namePublisher;
		this.author = author;
		this.typeDoc = typeDoc;
		this.language = language;
		this.numRelease = numRelease;
		this.yearPublish = yearPublish;
		this.quantity = quantity;
		this.price = price;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNamePublisher() {
		return namePublisher;
	}
	public void setNamePublisher(String namePublisher) {
		this.namePublisher = namePublisher;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTypeDoc() {
		return typeDoc;
	}
	public void setTypeDoc(String typeDoc) {
		this.typeDoc = typeDoc;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getNumRelease() {
		return numRelease;
	}
	public void setNumRelease(int numRelease) {
		this.numRelease = numRelease;
	}
	public int getYearPublish() {
		return yearPublish;
	}
	public void setYearPublish(int yearPublish) {
		this.yearPublish = yearPublish;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void input() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID: "); //nhap so thu tu
		this.setId(sc.nextLine());
		System.out.print("Enter Title: "); //nhap tieu de
		this.setTitle(sc.nextLine());
		System.out.print("Enter Name Publisher: "); //nhap nha xuat ban
		this.setNamePublisher(sc.nextLine());
		System.out.print("Enter Number Release: "); //nhap so ban phat hanh
		this.setNumRelease(sc.nextInt());
		sc.nextLine();
		System.out.print("Enter Author : "); //Nhap ten tac gia
		this.setAuthor(sc.nextLine());
		System.out.print("Enter Type Document : "); //nhap loai tai lieu
		this.setTypeDoc(sc.nextLine());
		sc.nextLine();
		System.out.print("Enter Year Publish: "); //nhap nam xuat ban
		this.setYearPublish(sc.nextInt());
		System.out.print("Enter Price: "); //nhap gia
		this.setPrice(sc.nextDouble());
		System.out.print("Enter Quantity: "); //nhap so luong
		this.setQuantity(sc.nextInt());
		sc.nextLine();
		System.out.print("Enter Language : "); //nhap ngon ngu
		this.setLanguage(sc.nextLine());
	}
	public void output() {
		// TODO Auto-generated method stub
		System.out.format("\n%-12s%-20s%-20s%-20d%-20s%-15s%-15d%-15f%-15s%-18s"
				         ,id,title,namePublisher, numRelease,author,typeDoc,yearPublish,price,quantity,language);
//		System.out.println("ID: "+ this.getId());
//		System.out.println("Title: "+ this.getTitle());
//		System.out.println("Name Publish: "+ this.getNamePublisher());
//		System.out.println("Author: "+ this.getAuthor());
//		System.out.println("Type Document: "+ this.getTypeDoc());
//		System.out.println("Year Publish: "+ this.getYearPublish());
//		System.out.println("Price: "+ this.getPrice());
//		System.out.println("Quantity: "+ this.getQuantity());
//		System.out.println("Language: "+ this.getLanguage());
//		System.out.println("Format: "+ this.getFormat());
	}
	abstract double quantity();
//	@Override
//	public String toString() {
//		return "Document [id=" + id + ", title=" + title + ", namePublisher=" + namePublisher + ", author=" + author
//				+ ", typeDoc=" + typeDoc + ", language=" + language + ", format=" + format + ", numRelease="
//				+ numRelease + ", yearPublish=" + yearPublish + ", quantity=" + quantity + ", price=" + price + "]";
//	}
	
}

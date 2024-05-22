package manager_document;

import java.util.Scanner;

public class Book extends Document implements IDocument{
	private String isbn; // ma sach quoc te
	private String genre; // the loai(tieu thuyet, study book, ngon tinh)
	private String status; //trang thai( con/khong)
	public Book() {
		super();
		this.isbn = " ";
		this.genre = " ";
		this.status = " ";
	}


	public Book(String id, String title, String namePublisher, String author, String typeDoc, String language,
			int numRelease, int yearPublish,double quantity, double price,String isbn, String genre,String status) {
		super(id, title, namePublisher, author, typeDoc, language, numRelease, yearPublish, quantity, price);
		this.isbn = isbn;
		this.genre = genre;
		this.status = status;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------BOOK------------------");
		super.input();
		System.out.print("Enter International Standard Book Number");
		this.setIsbn(sc.nextLine());
		System.out.print("Enter Genre : ");
	    this.setGenre(sc.nextLine());
	    System.out.print("Enter Status : ");
	    this.setStatus(sc.nextLine());
	}
  public void output()
  {
	//  System.out.println("-----------------BOOK------------------");
	  super.output();
	  System.out.format("%-15s%-18s%-18s",isbn,genre,status);
//	  System.out.println("International Standard Book Number: "+ getIsbn());  
//	  System.out.println("Genre: "+ this.getGenre());
//	  System.out.println("Status : "+ this.getStatus());
//	  System.out.println("Sum total type book: "+ totalTypeBook);
  }



public double quantity() {
	// TODO Auto-generated method stub
	return this.getQuantity();
}


@Override
public double sum_quantity() {
	// TODO Auto-generated method stub
	return 0;
}


//@Override
//public String toString() {
//	
//	return "----------------Book-----------------\nID: " + id + "\nTitle: " + title
//			+ "\nName Publisher: " + namePublisher + "\nAuthor: " + author + "\nType Doc: " + typeDoc + "\nLanguage: "
//			+ language + "\nFormat: " + format + "\nNumber Release: " + numRelease + "\nYear Publish: " + yearPublish
//			+ "\nQuantity: " + quantity + "\nPrice: " + price + "\nIsbn: " + isbn + "\nGenre: " + genre + "\nStatus: " + status+"\n-----------------------------------\n";
//}

}	


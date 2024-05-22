package manager_document;

import java.util.Scanner;

public class Newspaper extends Document implements IDocument {
    private String issueDate;
    private String jourNalist;
    private String typeNewspaper;
    
	public Newspaper() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Newspaper(String id, String title, String namePublisher, String author, String typeDoc, String language,
			 int numRelease,int yearPublish, double quantity, double price,String issueDate, String jourNalist, String typeNewspaper) {
		super(id, title, namePublisher, author, typeDoc, language, numRelease, yearPublish, quantity, price);
		this.issueDate = issueDate;
		this.jourNalist = jourNalist;
		this.typeNewspaper = typeNewspaper;
	}
	
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getJourNalist() {
		return jourNalist;
	}
	public void setJourNalist(String jourNalist) {
		this.jourNalist = jourNalist;
	}
	public String getTypeNewspaper() {
		return typeNewspaper;
	}
	public void setTypeNewspaper(String typeNewspaper) {
		this.typeNewspaper = typeNewspaper;
	}
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------NEWSPAPER--------------");
		super.input();
		System.out.print("Enter IssueDate(dd-mm-yy): ");
		this.setIssueDate(sc.nextLine());
		System.out.print("Enter JourNalist: ");
		this.setJourNalist(sc.nextLine());
		System.out.print("Enter type Newspaper: ");
		this.setTypeNewspaper(sc.nextLine());
	}
	public void output()
	{
		//System.out.println("---------------NEWSPAPER---------------");
		super.output();
		System.out.format("%-15s%-18s%-18s",issueDate,jourNalist,typeNewspaper);
//		System.out.println("Issue Date: "+ this.getIssueDate());
//		System.out.println("Jour Nalist: "+ this.getJourNalist());
//		System.out.println("Type Newspaper: "+ this.getTypeNewspaper());
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
	

}

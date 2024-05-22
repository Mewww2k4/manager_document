package manager_document;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Borrowing_Document {
     Document doc;
     Student stu;
     private int numPhieuMuon;
     private Date ngayMuon;
     private Date ngayTra;
     
	public Borrowing_Document() {
		super();
	}

	public Borrowing_Document(Document doc, Student stu, int numPhieuMuon, Date ngayMuon, Date ngayTra) {
		super();
		this.doc = doc;
		this.stu = stu;
		this.numPhieuMuon = numPhieuMuon;
		this.ngayMuon = ngayMuon;
		this.ngayTra = ngayTra;
	}

	public Document getDoc() {
		return doc;
	}

	public void setDoc(Document doc) {
		this.doc = doc;
	}

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}

	public int getNumPhieuMuon() {
		return numPhieuMuon;
	}

	public void setNumPhieuMuon(int numPhieuMuon) {
		this.numPhieuMuon = numPhieuMuon;
	}

	public Date getNgayMuon() {
		return ngayMuon;
	}

	public void setNgayMuon(Date ngayMuon) {
		this.ngayMuon = ngayMuon;
	}

	public Date getNgayTra() {
		return ngayTra;
	}

	public void setNgayTra(Date ngayTra) {
		this.ngayTra = ngayTra;
	}
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Bill: ");
		this.setNumPhieuMuon(sc.nextInt());
		sc.nextLine();
		stu= new Student();
		this.stu.input();
		System.out.print("Enter Title you want to Borrow: ");
		this.doc = new Document() {

			@Override
			public double sum_quantity() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			double quantity() {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
		this.doc.setTitle(sc.nextLine());
		System.out.print("Enter Type Document: ");
		this.doc.setTypeDoc(sc.nextLine());
		System.out.print("Enter Author: ");
		this.doc.setAuthor(sc.nextLine());
		System.out.print("Enter Language: ");
		this.doc.setLanguage(sc.nextLine());
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		try{
			System.out.println("Enter borrow date(dd-MM-yyyy): ");
			ngayMuon = df.parse(sc.nextLine());
			System.out.println("Enter return date(dd-MM-yyyy): ");
			ngayTra = df.parse(sc.nextLine());
		}catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
		
	}
	void output()
	{
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("---------------CARD BORROWING DOCUMENT----------------------");
		System.out.println("Number bill: "+ this.getNumPhieuMuon());
		this.stu.output();
		System.out.println("Title Book : "+ this.doc.getTitle());
		System.out.println("Author : "+ this.doc.getAuthor());
		System.out.println("Language: "+ this.doc.getLanguage());
		System.out.println("Date Borrow Book: "+ df.format(ngayMuon)+"     Date Return Book: "+ df.format(ngayTra));
		System.out.println("-------------------------------------------------------------");
	

}
}

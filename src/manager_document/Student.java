package manager_document;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
	private String ID;          //ma sinh vien
	private String name;        // ten 
	private Date dayOfBirth;  // ngay sinh 
	private String department;  //khoa 
	private String lop;         // lop

	public Student() {
		super();
	}

	public Student(String iD, String name, Date dayOfBirth, String department,String lop) {
		super();
		this.ID = iD;
		this.name = name;
		this.dayOfBirth = dayOfBirth;
		this.department = department;
		this.lop = lop;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		this.ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(Date dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID: ");
		this.setID(sc.nextLine());
		System.out.print("Enter Name: ");
		this.setName(sc.nextLine());
		System.out.print("Enter Day of birth: ");
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		try{
			System.out.println("Enter borrow date(dd-MM-yyyy): ");
			dayOfBirth = df.parse(sc.nextLine());
		}catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
		System.out.print("Enter department");
		this.setDepartment(sc.nextLine());
		System.out.print("Enter Class: ");
		this.setLop(sc.nextLine());
	}
	void output()
	{
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("ID: "+ this.getID()+ " "
				+ "\nName: "+ this.getName());
		System.out.println("Day of Birth: "+ df.format(dayOfBirth));
		System.out.println("Department :" + this.getDepartment()+"\nClass: "+ this.getLop());
	}
    
}

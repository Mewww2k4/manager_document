package manager_document;

import java.util.Scanner;

public class Magazine extends Document implements IDocument{
	private String editor, publishcationFrequecy;
	public Magazine() {
		super();
	}

	public Magazine(String id, String title, String namePublisher, String author, String typeDoc, String language,
			int numRelease, int yearPublish, double quantity, double price,String editor, String publishcationFrequecy) {
		super(id, title, namePublisher, author, typeDoc, language, numRelease, yearPublish, quantity, price);
		this.editor = editor;
		this.publishcationFrequecy = publishcationFrequecy;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public String getPublishcationFrequecy() {
		return publishcationFrequecy;
	}

	public void setPublishcationFrequecy(String publishcationFrequecy) {
		this.publishcationFrequecy = publishcationFrequecy;
	}

	public void input()
	{
		System.out.println("-----------------MAGAZINE------------------");
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Editor: ");
		this.setEditor(sc.nextLine());
		System.out.print("Enter Publishcation Frequecy: ");
		this.setPublishcationFrequecy(sc.nextLine());
	}
	public void output()
	{
		super.output();
		System.out.format("%-15s%-18s", editor,publishcationFrequecy);
//		System.out.println("Editor : "+ this.getEditor());
//		System.out.println("Publishcation Frequecy: "+ this.getPublishcationFrequecy());
//		System.out.println("Total type Mahazine: "+ totalTypeMagazine);
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

package manager_document;

import java.util.ArrayList;
import java.util.Scanner;



public class Borrowing_List {
	ArrayList<Borrowing_Document> list = new ArrayList<Borrowing_Document>();
	int numberOfDocuments = 0;

	public void inputList() {
		Scanner sc = new Scanner(System.in);

		char continueInput;
		do {
			System.out.println("-------------------CARD BORROWING DOCUMENT " + (numberOfDocuments + 1) + "-----------------");
			Borrowing_Document doc = new Borrowing_Document();
			doc.input();
			list.add(doc);
			numberOfDocuments++;
			System.out.print("You want continue? (Y:Yes/N:No): ");
			continueInput = sc.next().charAt(0);
		} while (continueInput == 'Y' || continueInput == 'y');

	}

	public void outputList() {
		System.out.println("-------------------CART BORROWING DOCUMENT------------------");
		for (Borrowing_Document borrowing_Document : list) {
			borrowing_Document.output();
		}
	}
	public void update() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID need update: ");
		String id = sc.nextLine();
		for (Borrowing_Document borrowing_Document : list) {
			if(borrowing_Document.stu.getID().equals(id))
			{
				borrowing_Document.input();
				System.out.println("============[DELETE SUCCESSFULL]===========");
			}
		}
	}

	public void menu()
	{
		
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
	    	Scanner sc1 =  new Scanner(System.in);
	    	System.out.println("|-------------------***MENU***------------------|");
	    	System.out.println("|      1. Add New Card Borrow Document          |");
	    	System.out.println("|      2. In Card Borrow Document               |");
	     	System.out.println("|      3. Update by ID Student                  |");
	    	System.out.println("|      0: Exit                                  |");
	    	System.out.println("|-----------------------------------------------|");
	    	System.out.print("Please enter select of you: ");
	    	choice = sc1.nextInt();
	    	if(choice == 1)
	    	{
	    		inputList();
	    	}else if(choice==2)
	    	{
	    		outputList();
	    	}else if(choice==3) {
	    		update();
	    	}
	
	    	else if(choice==0)
	    	{
	    		break;
	    	}else {
	    		System.out.println("Lua chon khong hop le !!!");
	    	}
		}while(true);
	}
}

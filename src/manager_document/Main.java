package manager_document;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new  Scanner(System.in);
		int choice;
		do {
			System.out.println("|-------------------***MENU***------------------|");
	    	System.out.println("| 1. Manager Document                           |");
	    	System.out.println("| 2. Card borrow document                       |");
	    	System.out.println("| 0: Exit                                       |");
	    	System.out.println("|-----------------------------------------------|");
	    	System.out.print("Please enter select of you: ");
	    	choice = sc.nextInt();
	    	if(choice==1)
	    	{
	    		DocumentList doc = new DocumentList();
	    		doc.menu();
	    	}else if(choice==2)
	    	{
	    		Borrowing_List bor = new Borrowing_List();
	    		bor.menu();
	    	}else if(choice == 0)
	    	{
	    		break;
	    	}
		}while(true);
	}

}

package manager_document;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DocumentList {
	ArrayList<Book> bo = new ArrayList<Book>();
	ArrayList<Newspaper> news = new ArrayList<Newspaper>();
	ArrayList<Magazine> ma = new ArrayList<Magazine>();
	int type, choice, n;

	public void addNew() {
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("|-------------------***MENU***------------------|");
			System.out.println("|           1:Add New information Book          |");
			System.out.println("|           2:Add New information Magazine      |");
			System.out.println("|           3:Add New information Newspaper     |");
			System.out.println("|           0: Exit                             |");
			System.out.println("|-----------------------------------------------|");
			System.out.print("Please enter select of you: ");
			type = sc.nextInt();
			if (type == 1) {
				Book b = new Book();
				b.input();
				bo.add(b);
			} else if (type == 2) {
				Magazine m = new Magazine();
				m.input();
				ma.add(m);
			} else if (type == 3) {
				Newspaper n = new Newspaper();
				n.input();
				news.add(n);
			} else if (type == 0) {
				break;
			} else {
				System.out.println("Invalid selection, please re-enter!!!");
			}
			System.out.println("You want continue(1:Yes/2:No)");
			choice = sc.nextInt();
			if (choice == 2) {
				break;
			}
		} while (true);
	}

	public void showInfor() {
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("|-------------------***MENU***------------------|");
			System.out.println("|         1: Display Information Book           |");
			System.out.println("|         2: Display Information Magazine       |");
			System.out.println("|         3: Display Information Newspaper      |");
			System.out.println("|         0: Exit                               |");
			System.out.println("|-----------------------------------------------|");
			System.out.print("Please enter select of you: ");
			type = sc.nextInt();
			if (type == 1) {
				System.out.println("\n\t\t\t\t\t\t\t\t\t-------------------------------BOOK-----------------------------------");
				System.out.format("\n%-12s%-20s%-20s%-20s%-20s%-15s%-15s%-15s%-15s%-18s%-15s%-18s%-18s\n", "ID",
						"Title", "Publisher", "Number Release", "Author", "Type", "Year Publish", "Price", "Quantity",
						"Language", "ISBN", "Genre", "Status");
				for (Book book : bo) {
					book.output();
					System.out.println();
				}
			} else if (type == 2) {
				System.out.println("\n\t\t\t\t\t\t\t\t\t-----------------------------MAGAZINE-------------------------------");
				System.out.format("\n%-12s%-20s%-20s%-20s%-20s%-15s%-15s%-15s%-15s%-18s%-15s%-18s", "ID", "Title",
						"Publisher", "Number Release", "Author", "Type", "Year Publish", "Price", "Quantity",
						"Language", "Editor", "Frequecy Publish");
				for (Magazine magazine : ma) {
					magazine.output();
					System.out.println();
				}

			} else if (type == 3) {
				System.out.println("\n\t\t\t\t\t\t\t\t\t-----------------------------NEWSPAPER-------------------------------");
				System.out.format("\n%-12s%-20s%-20s%-20s%-20s%-15s%-15s%-15s%-15s%-18s%-15s%-18s%-18s", "ID", "Title",
						"Publisher", "Number Release", "Author", "Type", "Year Publish", "Price", "Quantity",
						"Language", "Issue Date", "Journalist", "Type Newspaper");
				for (Newspaper newspaper : news) {
					newspaper.output();
					System.out.println();
				}
			} else if (type == 0) {
				break;
			} else {
				System.out.println("Select invalid!!!");
			}
		} while (true);
	}

	public void update() {
		String idUpdate;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("|-------------------***MENU***------------------|");
			System.out.println("|               1:  UpDate Book                 |");
			System.out.println("|               2:  UpDate Magazine             |");
			System.out.println("|               3:  UpDate Newspaper            |");
			System.out.println("|               0:  Exit                        |");
			System.out.println("|-----------------------------------------------|");
			System.out.print("Please enter select of you: ");
			type = sc.nextInt();
			sc.nextLine();
			if (type == 1) {
				System.out.println("Enter id need update: ");
				idUpdate = sc.nextLine();
				for (Book book : bo) {
					if (book.getId().equals(idUpdate)) {
						book.input();
						System.out.println("---------***NOTE: UPDATE SUCCESSFULL!!!***----------");
					} else {
						System.out.println("---------***NOTE: UPDATE NOT SUCCESSFULL!!!***----------");
					}
				}
			} else if (type == 3) {
				System.out.println("Enter id need update: ");
				idUpdate = sc.nextLine();
				for (Newspaper newspaper : news) {
					if (newspaper.getId().equals(idUpdate)) {
						newspaper.input();
						System.out.println("---------***NOTE: UPDATE SUCCESSFULL!!!***----------");
					} else {
						System.out.println("---------***NOTE: UPDATE NOT SUCCESSFULL!!!***----------");
					}
				}
			} else if (type == 2) {
				System.out.println("Enter id need update: ");
				idUpdate = sc.nextLine();
				for (Magazine magazine : ma) {
					if (magazine.getId().equals(idUpdate)) {
						magazine.input();
						System.out.println("---------***NOTE: UPDATE SUCCESSFULL!!!***----------");
					} else {
						System.out.println("---------***NOTE: UPDATE NOT SUCCESSFULL!!!***----------");
					}
				}
			} else if (type == 0) {
				break;
			} else {
				System.out.println("Seclect Invalid!!!");
			}
		} while (true);
	}

//	public void findbyAuthor() throws IOException {
//		System.out.print("*Enter Name author need find: ");
//		String author = sc.nextLine();
//		try (BufferedWriter writer = new BufferedWriter(
//				new FileWriter("D:\\FC1_CS 303\\Manager_Document\\src\\manager_document\\result_file.txt"))) {
//			for (Document document : list) {
//				if (document.getAuthor().equals(author)) {
//					document.output();
//					writer.write("");
//					System.out.println("--------***NOTE: SAVE FILE SUCCESSFULL!!!***---------");
//				} else {
//					System.out.println("--------***NOTE: NOT FOUND!!!***---------");
//				}
//			}
//
//		}
//	}
	public void findbyAuthor() {
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("|-------------------***MENU***------------------|");
			System.out.println("|               1:  Author Book                 |");
			System.out.println("|               2:  Author Magazine             |");
			System.out.println("|               3:  Author Newspaper            |");
			System.out.println("|               0:  Exit                        |");
			System.out.println("|-----------------------------------------------|");
			System.out.print("Please enter select of you: ");
			type = sc.nextInt();
			sc.nextLine();
			if (type == 1) {
				System.out.println("***Enter name author need find: ");
				String author = sc.nextLine();
				System.out.format("\n%-12s%-20s%-20s%-20s%-20s%-15s%-15s%-15s%-15s%-18s%-15s%-18s%-18s\n", "ID",
						"Title", "Publisher", "Number Release", "Author", "Type", "Year Publish", "Price", "Quantity",
						"Language", "ISBN", "Genre", "Status");
				for (Book book : bo) {
					if (book.getAuthor().equals(author)) {
						book.output();
						System.out.println("---------***NOTE: SUCCESSFULL!!!***----------");
					} else {
						System.out.println("---------***NOTE: NOT FOUND!!!***----------");
					}
				}
			} else if (type == 2) {
				System.out.println("***Enter name author need find: ");
				String idfind = sc.nextLine();
				System.out.format("\n%-12s%-20s%-20s%-20s%-20s%-15s%-15s%-15s%-15s%-18s%-15s%-18s", "ID", "Title",
						"Publisher", "Number Release", "Author", "Type", "Year Publish", "Price", "Quantity",
						"Language", "Editor", "Frequecy Publish");
				for (Magazine magazine : ma) {
					if (magazine.getAuthor().equals(idfind)) {
						magazine.output();
						System.out.println("---------***NOTE: SUCCESSFULL!!!***----------");
					} else {
						System.out.println("---------***NOTE: NOT FOUND!!!***----------");
					}
				}
			} else if (type == 3) {
				System.out.println("***Enter name author need find: ");
				String idfind = sc.nextLine();
				System.out.format("\n%-12s%-20s%-20s%-20s%-20s%-15s%-15s%-15s%-15s%-18s%-15s%-18s%-18s", "ID", "Title",
						"Publisher", "Number Release", "Author", "Type", "Year Publish", "Price", "Quantity",
						"Language", "Issue Date", "Journalist", "Type Newspaper");
				for (Newspaper newspaper : news) {
					if (newspaper.getAuthor().equals(idfind)) {
						newspaper.output();
						System.out.println("---------***NOTE: SUCCESSFULL!!!***----------");
					} else {
						System.out.println("---------***NOTE: NOT FOUND!!!***----------");
					}
				}
			} else if (type == 0) {
				break;
			} else {
				System.out.println("Select invalid!!!");
			}

		} while (true);
	}

	public void sort() throws IOException {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("|-------------------***MENU***------------------|");
			System.out.println("|               1:  Sort Price Book             |");
			System.out.println("|               2:  Sort Price Magazine         |");
			System.out.println("|               3:  Sort Price Newspaper        |");
			System.out.println("|               0:  Exit                        |");
			System.out.println("|-----------------------------------------------|");
			System.out.print("Please enter select of you: ");
			type = sc.nextInt();
			if (type == 1) {
				for (int i = 0; i < bo.size() - 1; i++) {
					for (int j = i + 1; j < bo.size(); j++) {
						if (bo.get(i).getPrice() > bo.get(j).getPrice()) {
							Book temp = bo.get(i);
							bo.set(i, bo.get(j));
							bo.set(j, temp);
							System.out.println("---------***NOTE:SORT BY PRICE SUCCESSFULL!!!***----------");
						}
					}
				}
			} else if (type == 2) {
				for (int i = 0; i < ma.size() - 1; i++) {
					for (int j = i + 1; j < ma.size(); j++) {
						if (ma.get(i).getPrice() > ma.get(j).getPrice()) {
							Magazine temp = ma.get(i);
							ma.set(i, ma.get(j));
							ma.set(j, temp);
							System.out.println("---------***NOTE:SORT BY PRICE SUCCESSFULL!!!***----------");
						}
					}
				}
			} else if (type == 3) {
				for (int i = 0; i < news.size() - 1; i++) {
					for (int j = i + 1; j < news.size(); j++) {
						if (news.get(i).getPrice() > news.get(j).getPrice()) {
							Newspaper temp = news.get(i);
							news.set(i, news.get(j));
							news.set(j, temp);
							System.out.println("---------***NOTE:SORT BY PRICE SUCCESSFULL!!!***----------");
						}
					}
				}
			} else if (type == 0) {
				break;
			} else {
				System.out.println("Seclect invalid!!!");
			}
		} while (true);
	}

	public void ReadFile() throws IOException {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("|-------------------***MENU***------------------|");
			System.out.println("|               1:  Read file Book              |");
			System.out.println("|               2:  Read file Magazine         |");
			System.out.println("|               3:  Read file Newspaper        |");
			System.out.println("|               0:  Exit                        |");
			System.out.println("|-----------------------------------------------|");
			System.out.print("Please enter select of you: ");
			type = sc.nextInt();
			if (type == 1) {
				try {
					FileReader fr = new FileReader("book.txt");
					BufferedReader br = new BufferedReader(fr);
					String line = "";
					int lineCount = 0;
					System.out.println();
					while ((line = br.readLine()) != null) {
						if (lineCount <= 2) {
							lineCount++;
							continue;
						}
						System.out.println(line);
						String str[] = line.split("\\s{2,}");
						if (str.length <= 13) {
							String id = str[0];
							String title = str[1];
							String namePublisher = str[2];
							int numRelease =  Integer.parseInt(str[3]);
							String author = str[4];
							String typeDoc = str[5];
							int yearPublish =Integer.parseInt(str[6]);
							double price = Double.parseDouble(str[7]);
							double quantity = Double.parseDouble(str[8]);
							String language = str[9];
							String isbn = str[10];
							String genre = str[11];
							String status = str[12];

							Book b = new Book(id, title, namePublisher, author, typeDoc, language, numRelease,
									yearPublish, quantity, price, isbn, genre, status);
							bo.add(b);
							System.out.println(line);
						}
					}
					fr.close();
					br.close();

				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (type == 2) {
				try {
					FileReader fr = new FileReader("magazine.txt");
					BufferedReader br = new BufferedReader(fr);
					String line = "";
					int lineCount = 0;
					System.out.println();
					while ((line = br.readLine()) != null) {
						if (lineCount <= 2) {
							lineCount++;
							continue;
						}
						String str[] = line.split("\\s{2,}");
						if (str.length >= 12) {
							String id = str[0];
							String title = str[1];
							String namePublisher = str[2];
							int numRelease =  Integer.parseInt(str[3]);
							String author = str[4];
							String typeDoc = str[5];
							int yearPublish =Integer.parseInt(str[6]);
							double price = Double.parseDouble(str[7]);
							double quantity = Double.parseDouble(str[8]);
							String language = str[9];
							String editor = str[10];
							String publishcationFrequecy = str[11];

							Magazine m = new Magazine(id, title, namePublisher, author, typeDoc, language, numRelease,
									yearPublish, quantity, price, editor, publishcationFrequecy);
							ma.add(m);
						}
					}
					fr.close();
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (type == 3) {
				try {
					FileReader fr = new FileReader("newspaper.txt");
					BufferedReader br = new BufferedReader(fr);
					String line = "";
					int lineCount = 0;
					System.out.println();
					while ((line = br.readLine()) != null) {
						if (lineCount < 2) {
							lineCount++;
							continue;
						}
						String str[] = line.split("\\s{2,}");
						if (str.length >= 13) {
							String id = str[0];
							String title = str[1];
							String namePublisher = str[2];
							int numRelease =  Integer.parseInt(str[3]);
							String author = str[4];
							String typeDoc = str[5];
							int yearPublish =Integer.parseInt(str[6]);
							double price = Double.parseDouble(str[7]);
							double quantity = Double.parseDouble(str[8]);
							String language = str[9];
							String issueDate = str[10];
							String jourNalist = str[11];
							String typeNewspaper = str[12];

							Newspaper n = new Newspaper(id, title, namePublisher, author, typeDoc, language, numRelease,
									yearPublish, quantity, price, issueDate, jourNalist, typeNewspaper);
							news.add(n);
						}
					}
					fr.close();
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (type == 0) {
				break;
			}else {
				System.out.println("Seclect invalid! Please re-enter!!!");
			}
		} while (true);
	}

	public void saveFile() throws IOException {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("|-------------------***MENU***------------------|");
			System.out.println("|               1:  Save file Book              |");
			System.out.println("|               2:  Save file Magazine          |");
			System.out.println("|               3:  Save file Newspaper         |");
			System.out.println("|               0:  Exit                        |");
			System.out.println("|-----------------------------------------------|");
			System.out.print("Please enter select of you: ");
			type = sc.nextInt();
			if (type == 1) {
				File fo = new File("D:\\document.txt");
				FileWriter fw = new FileWriter(fo, true);
				try {
					fw.write("\n\t\t\t\t\t\t\t\t\t\t-------------------------------BOOK-----------------------------------");
					fw.write(String.format("\n%-12s%-20s%-20s%-20s%-20s%-15s%-15s%-15s%-15s%-18s%-15s%-18s%-18s\n",
							"ID", "Title", "Publisher", "Number Release", "Author", "Type", "Year Publish", "Price",
							"Quantity", "Language", "ISBN", "Genre", "Status"));
					for (Book book : bo) {
						String formattedString = String.format(
								"%-12s%-20s%-20s%-20s%-20s%-15s%-15s%-15s%-15s%-18s%-15s%-18s%-18s\n", book.getId(),
								book.getTitle(), book.getNamePublisher(), book.getNumRelease(), book.getAuthor(),
								book.getTypeDoc(), book.getYearPublish(), book.getPrice(), book.getQuantity(),
								book.getLanguage(), book.getIsbn(), book.getGenre(), book.getStatus());

						fw.write(formattedString);
					}
					fw.close();
					System.out.println("---------***NOTE:SAVE FILE SUCCESSFULL!!!***----------");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (type == 2) {
				File fo = new File("D:\\document.txt");
				FileWriter fw = new FileWriter(fo, true);
				try {
					fw.write("\n\t\t\t\t\t\t\t\t\t\t-------------------------------MAGAZINE-----------------------------------");
					fw.write(String.format("\n%-12s%-20s%-20s%-20s%-20s%-15s%-15s%-15s%-15s%-18s%-15s%-18s", "ID",
							"Title", "Publisher", "Number Release", "Author", "Type", "Year Publish", "Price",
							"Quantity", "Language", "Editor", "Frequecy Publish"));
					for (Magazine magazine : ma) {
						String formattedString = String.format(
								"\n%-12s%-20s%-20s%-20s%-20s%-15s%-15s%-15s%-15s%-18s%-15s%-18s", magazine.getId(),
								magazine.getTitle(), magazine.getNamePublisher(), magazine.getNumRelease(),
								magazine.getAuthor(), magazine.getTypeDoc(), magazine.getYearPublish(),
								magazine.getPrice(), magazine.getQuantity(), magazine.getLanguage(),
								magazine.getEditor(), magazine.getPublishcationFrequecy());
						fw.write(formattedString);
					}
					fw.close();
					System.out.println("---------***NOTE:SAVE FILE SUCCESSFULL!!!***----------");
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			} else if (type == 3) {
				File fo = new File("D:\\document.txt");
				FileWriter fw = new FileWriter(fo, true);
				try {
					fw.write("\n\t\t\t\t\t\t\t\t\t\t-------------------------------NEWSPAPER-----------------------------------\n");
					fw.write(String.format("\n%-12s%-20s%-20s%-20s%-20s%-15s%-15s%-15s%-15s%-18s%-15s%-18s%-18s", "ID",
							"Title", "Publisher", "Number Release", "Author", "Type", "Year Publish", "Price",
							"Quantity", "Language", "Issue Date", "Journalist", "Type Newspaper"));
					for (Newspaper newspaper : news) {
						String formattedString = String.format(
								"\n%-12s%-20s%-20s%-20s%-20s%-15s%-15s%-15s%-15s%-18s%-15s%-18s%-18s",
								newspaper.getId(), newspaper.getTitle(), newspaper.getNamePublisher(),
								newspaper.getNumRelease(), newspaper.getAuthor(), newspaper.getTypeDoc(),
								newspaper.getYearPublish(), newspaper.getPrice(), newspaper.getQuantity(),
								newspaper.getLanguage(), newspaper.getIssueDate(), newspaper.getJourNalist(),
								newspaper.getTypeNewspaper());

						fw.write(formattedString);
					}
					fw.close();
					System.out.println("---------***NOTE:SAVE FILE SUCCESSFULL!!!***----------");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (type == 0) {
				break;
			} else {
				System.out.println("Seclect invalid!!!");
			}
		} while (true);
	}

	public void sum_quatity() throws IOException {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("|-------------------***MENU***------------------|");
			System.out.println("|               1:  Caculate Book               |");
			System.out.println("|               2:  Caculate Magazine           |");
			System.out.println("|               3:  Caculate Newspaper          |");
			System.out.println("|               0:  Exit                        |");
			System.out.println("|-----------------------------------------------|");
			System.out.print("Please enter select of you: ");
			type = sc.nextInt();
			if (type == 1) {
				double sum = 0;
				for (Book book : bo) {
					sum += book.quantity();
				}
				System.out.println("Total quantity of Book : " + sum);
				File fo = new File("D:\\document.txt");
				FileWriter fw = new FileWriter(fo, true);
				try {
					fw.write("Total quantity of Book : " + sum);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (type == 2) {
				double sum = 0;
				for (Magazine magazine : ma) {
					sum += magazine.quantity();
				}
				System.out.println("Total quantity of Magazine : " + sum);
				File fo = new File("D:\\document.txt");
				FileWriter fw = new FileWriter(fo, true);
				try {
					fw.write("Total quantity of Magazin : " + sum);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (type == 3) {
				double sum = 0;
				for (Newspaper newspaper : news) {
					sum += newspaper.quantity();
				}
				System.out.println("Total quantity of Newspaper : " + sum);
				File fo = new File("D:\\document.txt");
				FileWriter fw = new FileWriter(fo, true);
				try {
					fw.write("Total quantity of Newspaper : " + sum);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (type == 0) {
				break;
			} else {
				System.out.println("Seclect invalid!!!");
			}
		} while (true);
	}

	public void delete() {
		Scanner sc = new Scanner(System.in);
		String idDelete;
		do {
			System.out.println("|-------------------***MENU***------------------|");
			System.out.println("|               1:  Delete Book                 |");
			System.out.println("|               2:  Delete Magazine             |");
			System.out.println("|               3:  Delete Newspaper            |");
			System.out.println("|               0:  Exit                        |");
			System.out.println("|-----------------------------------------------|");
			System.out.print("Please enter select of you: ");
			type = sc.nextInt();
			sc.nextLine();
			if (type == 1) {
				System.out.println("Enter Id need delete: ");
				idDelete = sc.nextLine();
				for (Book book : bo) {
					if (book.getId().equals(idDelete)) {
						bo.remove(book);
						System.out.println("-----------ID " + book.getId() + " DELETE SUCCESSFULL!!!-------------");
						break; // break after removing to avoid concurrent modification
					}
				}
			} else if (type == 2) {
				System.out.println("Enter Id need delete: ");
				idDelete = sc.nextLine();
				for (Magazine magazine : ma) {
					if (magazine.getId().equals(idDelete)) {
						ma.remove(magazine);
						System.out.println("-----------ID " + idDelete + " DELETE SUCCESSFULL!!!-------------");
						break;
					}
				}
			} else if (type == 3) {
				System.out.println("Enter Id need delete: ");
				idDelete = sc.nextLine();
				for (Newspaper newspaper : news) {
					if (newspaper.getId().equals(idDelete)) {
						news.remove(newspaper);
						System.out.println("-----------ID " + idDelete + " DELETE SUCCESSFULL!!!-------------");
						break;
					}
				}
			} else if (type == 0) {
				break;
			} else {
				System.out.println("Select invalid!!!");
			}
		} while (true);
	}

	public void menu() throws IOException {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("|-------------------***MENU***------------------|");
			System.out.println("|           1. Add new Document                 |");
			System.out.println("|           2. Show information Document        |");
			System.out.println("|           3. Caculate Quantity                |");
			System.out.println("|           4. Update information               |");
			System.out.println("|           5. Find by Author and               |");
			System.out.println("|           6. Sort Document                    |");
			System.out.println("|           7. Read file                        |");
			System.out.println("|           8. Save file                        |");
			System.out.println("|           9. Delete                           |");
			System.out.println("|           0. Exit                             |");
			System.out.println("|-----------------------------------------------|");
			System.out.print("Please enter select of you: ");
			choice = sc1.nextInt();
			if (choice == 1) {
				addNew();
			} else if (choice == 2) {
				showInfor();
			} else if (choice == 3) {
				sum_quatity();
			} else if (choice == 4) {
				update();
			} else if (choice == 5) {
				findbyAuthor();
			} else if (choice == 6) {
				sort();
			} else if (choice == 7) {
				ReadFile();
			} else if (choice == 8) {
				saveFile();
			} else if (choice == 9) {
				delete();
			} else if (choice == 0) {
				break;
			} else {
				System.out.println("Select invalid!!!");
			}
		} while (true);
	}
}

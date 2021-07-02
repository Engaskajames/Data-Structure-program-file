package FPfinals;
import java.util.Scanner;
import java.util.*;

    //James Angelo G. Engaska  
    //BSCS-101
public class Books {
    public static String stored[][] = new String[10][3];
    public static String[][] books = Books.stored;
    public static ArrayList<Books>bookList = new ArrayList<Books>();
    String book,writer,date;

    public Books(String book,String writer,String date){
            this.book=book;
            this.writer=writer;
            this.date=date;

        }
    // DO NOT USE STATIC METHOD IF YOU DONT NEED IT IN THE LIST OF COMMANDS
    public static String list() {
        String[][] books = Books.stored;
        int Val=1;

        for (Books book : bookList) { 
            
                System.out.println("\n===== BOOK ID: " + Val + " =======");
                newI++;
                System.out.println("Name: " + book.book);
                System.out.println("Author: " + book.writer);
                System.out.println("Date: " + book.date);
            }
        if(bookList.size()==0){
            System.out.println("\nNO BOOKS HAVE BEEN ADDED YET");

        }

        // System.out.println(Arrays.deepToString(books));

        return "";
    }

    public static String set() 
    {
        Scanner Process = new Scanner(System.in);
                        System.out.println("\nEnter the book title:");
                        String title = Process.nextLine();
                        System.out.println("\nEnter the book author:");
                        String author = Process.nextLine();
                        System.out.println("\nEnter the date:");
                        String date = Process.nextLine();
                        Books newBook = new Books(title,author,date);
                        bookList.add(newBook);
            System.out.println();

        return "";
    }
    
    public static String get() {
        Scanner Process = new Scanner(System.in);
        
        System.out.println("\nEnter the book title:");
        String get = Process.nextLine();
        
        for (Books book : bookList) 
		{
            if(book.book.equals(get))
			{
                bookList.remove(book);
                System.out.println("\nUser has taken the book : "+ get);
  
        }

        return "";
    }
}

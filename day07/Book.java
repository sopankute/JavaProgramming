import java.util.Scanner; // to read data from keyboard

public class Book {
// Data
    String title;
    int pages;
    String publisher;

//setter or mutator is replaced with default constructor
public Book() { //default constructor
        //creating scanner object
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter title of the book : ");
        title = scanner.nextLine();

        System.out.println("Enter publisher of the book:");
        publisher = scanner.nextLine();

        System.out.println("Enter no. of pages of the book:");
        pages = scanner.nextInt();
    }

//getter or accessor
    void getBook() {
        System.out.println(title+"\n"+pages+"\n"+publisher);
    }

//main() to make this class an executable class
    public static void main(String[] args) {

        Book b1 = new Book();        
        b1.getBook();

        Book b2 = new Book();
        b2.getBook();
    }
}

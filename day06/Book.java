public class Book {
// Data
    String title;
    int pages;
    String publisher;

//setter or mutator
    void setBook() {
        title = "Java";
        pages = 500;
        publisher = "TMH";
    }

//getter or accessor
    void getBook() {
        System.out.println(title+"\n"+pages+"\n"+publisher);
    }

//main() to make this class an executable class
    public static void main(String[] args) {
        //static methods cannot call non-static methods
        // setBook(); //CE
        // getBook(); //CE

        Book b1 = new Book(); // Creating an object
        //Also, the class constructor Book() will create 
        //an object with default values i.e title = null,
        //pages = 0 and publisher = null
        
        b1.setBook(); //sets the data members to values
        b1.getBook(); //prints
    }
}

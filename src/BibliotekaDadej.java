import java.util.ArrayList;
import java.util.Scanner;

class Book
{
    String title1;
    String Author;

    Book(String title1, String Author)
    {
        this.title1 = title1;
        this.Author = Author;
    }

}

public class BibliotekaDadej
{
    public static void main(String[] args)
    {
        ArrayList<Book> library = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Book: ");
            System.out.println("2. Search Book: ");
            System.out.println("3. Show Available Books; ");
            System.out.println("4. Output ");

            System.out.println("Select; ");
            int select = scanner.nextInt();

            switch (select) {
                case 1:
                    addBook(scanner, library);
                    break;
                case 2:
                    search(scanner, library);
                    break;
                case 3:
                    showAll(library);
                    break;
                case 4:
                    System.out.println("Goodbay: ");
                    System.exit(0);
                default:
                    System.out.println("Wrong number: ");
            }
        }
    }
    public static void  addBook(Scanner scanner, ArrayList<Book> biblioteka)
    {
        System.out.println("Enter title: ");
        String title1 =scanner.next();

        System.out.println("specify author: ");
        String Author = scanner.next();

        Book Book2= new Book(title1, Author);
        biblioteka.add(Book2);
        System.out.println("the book has been added.");
    }
    public static void search(Scanner scanner, ArrayList<Book> biblioteka)
    {
        System.out.println("Enter title: ");
        String searchedFor = scanner.next();

        for(Book book : biblioteka)
        {
            if (book.title1.equalsIgnoreCase(searchedFor))
            {
                System.out.println(book.title1 + book.Author);
                return;
            }
        }
    }

    public static void showAll(ArrayList<Book> library)
    {
        if (library.isEmpty())
        {
            System.out.println("the library is empty");
        }
        else
        {
            System.out.println("list");
            for (Book book : library)
            {
                System.out.println(book.title1 + book.title1);
            }
        }
    }
}
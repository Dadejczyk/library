import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
   public static String Author(String aut)
   {
       return aut;
   }

   public static String title(String tit)
   {
       return tit;
   }

    static class library
    {
        String value;
        static library next;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {

            System.out.println("1. Add a Book to the Library: ");
            System.out.println("2. Find Books by a given author: ");
            System.out.println("3. Search by title: ");
            int value = scanner.nextInt();




                if (value == 1)
                {
                    System.out.println("Specify author: ");
                    String Author = scanner.next();
                    System.out.println("Enter Title: ");
                    String title = scanner.next();
                    System.out.println("the author of the book is: " + (Author(Author)) + " Title: " + title);
                    System.out.println(" ");

                    ArrayList LibraryQ = new ArrayList(10);
                    LibraryQ.add(new Object());

                    library library = new library();
                    library.value = Author + title;

                }




        }


    }
}

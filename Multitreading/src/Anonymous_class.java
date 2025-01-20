
class Library
{
    public void addBook(String title, String author, int year)
    {
        System.out.println("the book title is " +title);
    }

}




public class Anonymous_class {
    public static void main(String[] args) {


        //let's create and anonymous class , insted of createed a new class and over riding the methond
        ///let's create an innrer class and over ride the meothonf addBook.




        Library library = new Library()
        {
            @Override
            public void addBook(String title, String author, int year) {
                System.out.println("the book title is " +title + " by " + author + " published in " + year);
            }
         };

        library = new Library()
        {
            public void addBook(String title, String author, int year) {
                System.out.println("the new book title is " +title + " by " + author + " published in " + year);
            }
        };

        library.addBook("Java", "Oracle", 2000);





    }
}


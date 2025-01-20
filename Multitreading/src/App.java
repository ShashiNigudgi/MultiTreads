public class App {

    public static void main(String[] args) {

        Book book = new Book();
        Paper paper = new Paper();
        Magzine magzine = new Magzine();

        //using priority you can only suggest schedular on what to do .
        //rest schedular will do it's job based on the algorithms
        System.out.println(paper.getPriority());
        //paper.setPriority(Thread.MAX_PRIORITY);
       // paper.setPriority(Thread.MIN_PRIORITY);
        paper.setPriority(Thread.NORM_PRIORITY);

        System.out.println(paper.getPriority());

        book.start();

        //using sleep , schedular will hold the thread for 2 mili second and then execute , meahwile
        //it will allow other threads to execute 
        try {
            Thread.sleep(2);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        paper.start();

        try {
            Thread.sleep(2);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        magzine.start();
    }

}
class Book extends Thread
{
    public  int bookno;

    public void run()
    {
        bookno = 100;

        for (int i = 1; i<bookno; i++)
        {
            System.out.println("list of book numbers are " +i);

            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}

class Paper extends Thread
{
    public  int paperno;

    public void run()
    {
        paperno = 100;
        System.out.println("--------------------------------");

        for (int i = 1; i<paperno; i++)
        {
            System.out.println("list of Page numbers are " +i);

            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}

class Magzine extends Thread
{
    public  int magzineno;

    public void run()
    {
        magzineno = 100;
        System.out.println("--------------------------------");

        for (int i = 1; i<magzineno; i++)
        {
            System.out.println("list of magzineno are " +i);

            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            Thread.sleep(10);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


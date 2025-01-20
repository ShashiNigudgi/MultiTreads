public class multiThreads {
    public static void main(String[] args) {

        for(int i = 0; i<=3; i ++)
        {
            Books b1 = new Books(i);
            b1.start();
        }
    }
}

class Books extends Thread {

    private final int bookno ;

    public Books(int bookno){
        this.bookno = bookno ;
    }


    public void run ()
    {
        for(int i = 1;i<=5;i++)
        {
            System.out.println("running the loop of"+i +" from thread :" +bookno);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class multiThreads {
    public static void main(String[] args) throws InterruptedException {

        //creating the for loop in order to understand the which thread the coplier is executing
        // and surprisingly the random threads will be selected and started.
        for(int i = 0; i<=3; i ++)
        {
            Books b1 = new Books(i);
            b1.start();
            b1.join();//this is used to kill the threads, basically after first thread it will run one by one.

        }
        //throw  new RuntimeException("Pls check it is failed ");
        ///even if it is a run time exception , threads will not stop.
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

            //let us create a run time exception in threads and see

//            if(bookno == 3)
//            {
//                throw new RuntimeException();
//            }
        }
    }
}
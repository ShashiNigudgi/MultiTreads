class taskService implements  Runnable
{
    private  int threaadno;

    public taskService(int threaadno) {
        this.threaadno = threaadno;
    }
    public  void run()
    {
        System.out.println("the thread running is :" +threaadno);
        try{
        Thread.sleep(1000);}
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.println("the thread running is completed :" + threaadno);
    }

}

public class ThreadsofArray {

    public static void main(String[] args) throws InterruptedException {
        int nooftimes = 5;

            Thread[] threads = new Thread[nooftimes];//this is thread of array.

        for(int i = 0 ; i<nooftimes;i++)
        {
            taskService t = new taskService(i);
            threads[i] = new Thread(new taskService(i));
            //threads[i] = new Thread(t);
            //the above two codes are same ;
        }

        //start the thread using for loop :

        for (Thread thread: threads){
            thread.start();
        }

        for (Thread thread: threads){
            try{
            thread.join();}
            catch (InterruptedException e){

                Thread.currentThread().interrupt();

            }
        }

    }
}

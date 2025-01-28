import java.util.function.Predicate;

public class OrderProcessing  extends Thread{

    private String order ;

    public OrderProcessing(String order)
    {
        this.order = order;
    }

    public void run() {

        System.out.println( order +" order is being processed :"+ " using thread " +Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){

            System.out.println("problem inside thread");
        }
        System.out.println(order + " order is processed, moving to food processing " +Thread.currentThread().getName());

    }
}

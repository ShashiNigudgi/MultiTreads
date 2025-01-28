public class DeliveryProcessing  extends  Thread{

    private String order ;

    public  DeliveryProcessing(String order)
    {
        this.order = order;
    }

    public void run() {

        System.out.println( order +" delivery is being processed :"+ " using thread " +Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){

            System.out.println("problem inside thread");
        }
        System.out.println(order + " delivery is processed & ready, finding the capitan to deliver..! " +Thread.currentThread().getName());

    }
}

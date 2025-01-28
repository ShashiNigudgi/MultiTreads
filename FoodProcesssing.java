public class FoodProcesssing extends  Thread{

    private String order ;

    public FoodProcesssing(String order)
    {
        this.order = order;
    }

    public void run() {

        System.out.println( order +" food is being processed :"+ " using thread " +Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){

            System.out.println("problem inside thread");
        }
        System.out.println(order + " food is processed & ready, moving to Delivery processing " +Thread.currentThread().getName());

    }
}


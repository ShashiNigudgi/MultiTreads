import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        /*let us impliment the food delivery system which performes
                    Order processing
                    food processing
                    delivery processing
        the main thing here is to make operating of order prepared one by one using threads*/

       // String[] orders = {"Pizza","Burger","Chocolate","Jawar Roti meals"};

        List<String> orders = new ArrayList<String>();
        orders.add("Pizza");
        orders.add("Burger");
        orders.add("Chocolate");
        orders.add("Jawar Roti meals");

        for(String order : orders){

            Thread t1 = new OrderProcessing(order);
            Thread t2 = new FoodProcesssing(order);
            Thread t3 = new DeliveryProcessing(order);

            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
        }




    }
}
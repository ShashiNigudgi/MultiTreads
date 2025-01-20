public class runnableImpl {
    public static void main(String[] args) {

        Runnable staff = new Staff();
        Runnable student = new Student();

        //Object of thread
        // you have to give the object name to the constructor , so you will create an Reference of
        //runnable(interface) and object of a call .

        //runnable will not have thread methonds , in that case you need to create and reference of the custom object
        //and then pass it to the constructor of Thread.
        //basically you need to create and object of thread here.

        Thread t1 = new Thread(staff);
        Thread t2 = new Thread(student);

        t1.start();
        t2.start();

    }
}

class Staff implements Runnable
{
    public  int staffno;

    public void run()
    {
        staffno = 5;

        for (int i = 1; i<staffno; i++)
        {
            System.out.println("list of staff numbers are " +i);

            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}

class Student implements Runnable
{
    public  int studentno;

    public void run()
    {
        studentno = 5;
        System.out.println("--------------------------------");

        for (int i = 1; i<studentno; i++)
        {
            System.out.println("list of Student numbers are " +i);

            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}



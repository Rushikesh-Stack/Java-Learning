
package MultiThreading_Collections_and_Introduction_to_Streams;

class A1 implements Runnable
{
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("Hii.");
            try{
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B1 implements Runnable
{
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("Hello.");
            try{
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class RunnableDemo  {
    public static void main(String[] args) throws InterruptedException {

        A1 obj1 = new A1();
        B1 obj2 = new B1();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Priority of t1: " + t1.getPriority());
        System.out.println("Priority of t2: " + t2.getPriority());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Both threads finished!");
    }
}







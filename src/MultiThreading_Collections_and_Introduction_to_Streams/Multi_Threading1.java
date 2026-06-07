package MultiThreading_Collections_and_Introduction_to_Streams;

class A extends Thread
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

class B extends Thread
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

public class Multi_Threading1 {
    public static void main(String[] args) throws InterruptedException {

        A obj1 = new A();
        obj1.setPriority(Thread.MIN_PRIORITY); // 1
        obj1.start();

        System.out.println("Priority of obj1: " + obj1.getPriority());

        B obj2 = new B();
        obj2.setPriority(Thread.MAX_PRIORITY); // 10
        obj2.start();

        // Optional: wait for both threads to finish
        obj1.join();
        obj2.join();

        System.out.println("Both threads finished!");
    }
}



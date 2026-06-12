package New_Concepts;

sealed class Employee permits Developer,Manager{

    public void work()
    {
        System.out.println("Employee is working....");
    }
}

final class Developer extends Employee
{
    public void code()
    {
        System.out.println("Writing a Java Code for project modules.");
    }
}

final class Manager extends Employee
{
    public void manage()
    {
        System.out.println("Managing teams & track progress.");
    }
}

public class Sealed_Classes
{
    public static void main(String[] args)
    {
        Developer d=new Developer();
        d.work();
        d.code();

        Manager m=new Manager();
        m.work();
        m.manage();
    }
}

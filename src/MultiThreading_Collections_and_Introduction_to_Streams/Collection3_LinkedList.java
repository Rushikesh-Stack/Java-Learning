package MultiThreading_Collections_and_Introduction_to_Streams;


import java.util.LinkedList;

public class Collection3_LinkedList
{
    public static void main(String[] args)
    {
        LinkedList<String> ls=new LinkedList<>();

        ls.add("Raj");
        ls.add("Seema");
        ls.add("Rahul");
        ls.add("Meena");
        ls.add("Ashwin");
        ls.add("Aarti");
        ls.add("Rani");
        ls.add("Laxman");
        ls.add("Ram");
        ls.add("Raghav");
        ls.add("Vishu");
        ls.add("Raman");

        System.out.println("Elements in List:"+ls);

        ls.remove("Ram");
        System.out.println(ls);

        ls.remove(2);
        System.out.println(ls);

        LinkedList<String> ls2=new LinkedList<String>();
        ls2.add("Ravi");
        ls2.add("Hanuman");
        ls.addAll(ls2);

        System.out.println("Updated List:"+ ls);

        ls.removeAll(ls2);
        System.out.println("After calling removeAll() method: "+ls);

        ls.removeFirst();
        System.out.println("After invoking removeFirst() method: "+ls);

        ls.removeLast();
        System.out.println("After invoking removeLast() method: "+ls);

        ls.clear();
        System.out.println("After invoking clear() method: "+ls);



    }
}

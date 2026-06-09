package MultiThreading_Collections_and_Introduction_to_Streams;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Collection5_TreeSet
{
    public static void main(String[] args)
    {
        TreeSet<Integer> c1=new TreeSet<Integer>();
        c1.add(12);
        c1.add(5);
        c1.add(11);
        c1.add(45);
        c1.add(34);

        System.out.println("Elements in TreeSet Accesending Order:");
        Iterator<Integer> itr=c1.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("Elements in TreeSet Descending order  :");
        Iterator<Integer> itr1= c1.descendingIterator();


        while (itr1.hasNext())
        {
            System.out.println(itr1.next());
        }

        System.out.println("Lowest Value:"+ c1.pollFirst());
        System.out.println("Highest Value:"+ c1.pollLast());

        c1.add(12);
        c1.add(5);
        c1.add(45);

        //Navigable Set operations

        System.out.println("Initial Set: " + c1);
        System.out.println("Reverse Set: " + c1.descendingSet());
        System.out.println("Head Set: " + c1.headSet(12, true));
        System.out.println("SubSet: " + c1.subSet(5, false, 12, true));
        System.out.println("TailSet: " + c1.tailSet(12, false));


    }


}

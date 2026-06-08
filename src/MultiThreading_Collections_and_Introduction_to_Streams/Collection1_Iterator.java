package MultiThreading_Collections_and_Introduction_to_Streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection1_Iterator
{
    public static void main(String[] args)
    {
        Collection<String> names=new ArrayList<String>();

        names.add("Rahul");
        names.add("Meena");
        names.add("Sita");
        names.add("Ram");
        names.add("Rahul");

        Iterator<String> itr = names.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}

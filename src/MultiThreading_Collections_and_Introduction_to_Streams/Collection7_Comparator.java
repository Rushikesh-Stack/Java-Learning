package MultiThreading_Collections_and_Introduction_to_Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collection7_Comparator
{
    public static void main(String[] args) {

        Comparator<Integer> com=new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {

                if(i%10>j%10)
                    return 1;
                else
                    return -1;
            }

        };

        List<Integer> list=new ArrayList<>();
        list.add(38);
        list.add(12);
        list.add(44);
        list.add(78);
        list.add(56);
        list.add(3);

        Collections.sort(list , com);

        System.out.println(list);


    }
}

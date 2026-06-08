package MultiThreading_Collections_and_Introduction_to_Streams;

import java.util.*;

public class Collection1_List
{
    public static void main(String[] args) {

        List<Integer> nums1= new ArrayList<Integer>();
        nums1.add(4);
        nums1.add(6);
        nums1.add(11);
        nums1.add(475);
        nums1.add(67);

        System.out.println("Element at index:"+nums1.get(2));
        System.out.println("Index of 67:"+nums1.indexOf(60));


//        for(int n: nums)
//        {
//            System.out.println(n+2*2);
//        }


        Set<Integer> nums= new HashSet<Integer>();
        nums.add(4);
        nums.add(6);
        nums.add(1);
        nums.add(4);
        nums.add(6);

        for(int n: nums)
        {
            System.out.println(n+2);
        }
    }
}

package MultiThreading_Collections_and_Introduction_to_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Collection9_StreamAPI
{
    public static void main(String[] args)
    {
        List<Integer> nums= Arrays.asList(3,4,8,1,56,6);

//        Stream<Integer> s1=nums.stream();
//        Stream<Integer> s2=s1.filter(n-> n % 2 == 0);
//        Stream<Integer>s3= s2.map(n->n*2);
//        s3.forEach(n-> System.out.println(n));

//        Predicate<Integer> p=new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer n) {
//                return n%2==0;
//            }
//        };

//
//
//        Function<Integer,Integer> fun=new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer n) {
//                return n*2;
//            }
//        };

        Predicate<Integer> p= (n)-> n%2==0;

        Function<Integer,Integer> fun=(Integer n)-> n*2;


        int result = nums.stream()
                .filter(p)
                .map(fun)
                .reduce(0,(c,e)-> c+e);

        System.out.println(result);



    }
}

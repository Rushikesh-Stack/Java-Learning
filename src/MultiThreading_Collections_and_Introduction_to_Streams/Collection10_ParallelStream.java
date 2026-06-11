package MultiThreading_Collections_and_Introduction_to_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Collection10_ParallelStream
{
    public static void main(String[] args) {

        int size=10000;
        List<Integer> nums= new ArrayList<>(size);

        Random ran =new Random();

        for(int i=1;i<size;i++)
        {
            nums.add(ran.nextInt(100));
        }

//        System.out.println(nums);

        List<Integer> evenNo=nums.stream().parallel().filter(n-> n%2==0).sorted().toList();
        System.out.println("Even Nos:"+evenNo);

        long startSeq=System.currentTimeMillis();
        int sum1=evenNo.stream().mapToInt(n->n).sum();
        System.out.println("Sum of Even no:"+sum1);
        long endSeq=System.currentTimeMillis();

        long startPara=System.currentTimeMillis();
        int sum2=evenNo.parallelStream().mapToInt(n->n).sum();
        System.out.println("Sum of Even no:"+sum2);

        long endPara=System.currentTimeMillis();

        System.out.println(sum1+ "|" +sum2);
        System.out.println("Sequential:"+(endSeq - startSeq));
        System.out.println("Parallel:"+(endPara - startPara));





    }
}

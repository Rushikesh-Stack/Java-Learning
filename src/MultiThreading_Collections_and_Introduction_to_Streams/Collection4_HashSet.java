package MultiThreading_Collections_and_Introduction_to_Streams;


import java.util.HashSet;

public class Collection4_HashSet {
    public static void main(String[] args)
    {
        HashSet<String> h=new HashSet<>();

        h.add("Java");
        h.add("Python");
        h.add("Rust");
        h.add("Java");
        h.add("Rust");
        h.add("C++");

        System.out.println(h);

        System.out.println("Has a Java?"+h.contains("Java"));
        System.out.println("Has a C?"+h.contains("C"));

        System.out.println("Size:"+h.size());

        h.remove("Rust");
        System.out.println("After Remove:"+h);

        System.out.println("Is Empty?:"+h.isEmpty());

        h.clear();
        System.out.println("After Clear:"+h);

    }
}

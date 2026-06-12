package MultiThreading_Collections_and_Introduction_to_Streams;

import java.util.Arrays;
import java.util.List;

public class Collection12_MethodReference
{
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Aryan","Nayan","Kamala","Nitya");

        List<String> UName=names.stream().map(String::toUpperCase).toList();
        UName.forEach(System.out::println);



    }
}


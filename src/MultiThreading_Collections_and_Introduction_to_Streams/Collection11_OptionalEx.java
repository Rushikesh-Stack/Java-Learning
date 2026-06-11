package MultiThreading_Collections_and_Introduction_to_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Collection11_OptionalEx
{
    public static void main(String[] args) {

        List<String> names= Arrays.asList("Rushi","Rama","Soham","Laxmi","Laxman");
        System.out.println(names);

        Optional<String> name = Optional.of(names.stream().filter(n -> n.contains("x")).findFirst().orElse("Not Found"));
        System.out.println("String contains x:"+name.get());


    }
}


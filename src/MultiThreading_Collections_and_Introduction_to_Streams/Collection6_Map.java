package MultiThreading_Collections_and_Introduction_to_Streams;

import java.util.HashMap;
import java.util.Map;

public class Collection6_Map
{
    public static void main(String[] args) {

        Map<String,Integer> students = new HashMap<>();

        students.put("Raj",67);
        students.put("Sameer",89);
        students.put("Rani",97);
        students.put("Trisha",77);
        students.put("Raj",57);
        students.put("Rajesh",45);
        students.put("Amit",89);
        students.put("Sita",67);

        System.out.println(students);

        System.out.println(students.get("Sita"));

        System.out.println(students.keySet());

        for(String key: students.keySet())
        {
            System.out.println(key+" : "+ students.get(key));
        }

    }
}

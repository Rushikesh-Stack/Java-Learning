package MultiThreading_Collections_and_Introduction_to_Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
    int age;
    String name;

    public Student(int age, String  name)
    {
        this.age=age;
        this.name=name;
    }

    public String toString()
    {
        return "Student [age= "+ age +", name= "+name+ "]";
    }

}

public class Collection8_Comparator2
{
    public static void main(String[] args)
    {
        Comparator<Student> com=new Comparator<Student>() {
            @Override
            public int compare(Student i, Student j) {

                if(i.age>j.age)
                    return 1;
                else
                    return -1;
            }

        };

        List<Student> list=new ArrayList<Student>();
        list.add(new Student(21, "Ram"));
        list.add(new Student(19, "Sita"));
        list.add(new Student(27, "Sammer"));
        list.add(new Student(23 ,"Shanui"));
        list.add(new Student(28, "Maruti"));
        list.add(new Student(18, "Raman"));

        Collections.sort(list  , com);

        for(Student s: list)
            System.out.println(s);
    }
}

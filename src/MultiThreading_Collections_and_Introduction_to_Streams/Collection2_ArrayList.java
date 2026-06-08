package MultiThreading_Collections_and_Introduction_to_Streams;

import java.util.ArrayList;

class student
{
    int rollno,age;
    String name;

    student(int rollno, String name ,int age)
    {
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
}

public class Collection2_ArrayList
{
    public static void main(String[] args) {
        ArrayList<student> info = new ArrayList<student>();

        info.add(new student(1,"Rushikesh",20));
        info.add(new student(2,"Kunal",21));
        info.add(new student(4,"Mala",20));
        info.add(new student(5,"Baban",19));

        for(student s: info)
        {
            System.out.println(s.rollno+" "+ s.name +" "+ s.age);
        }

        info.remove(2);
        for(student s: info)
        {
            System.out.println(s.rollno+" "+ s.name +" "+ s.age);
        }

        System.out.println("List is Empty:"+info.isEmpty());
        System.out.println("Size:"+info.size());
    }
}


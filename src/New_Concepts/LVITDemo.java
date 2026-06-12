package New_Concepts;

import java.util.ArrayList;

public class LVITDemo
{
    public static void main(String[] args) {


        var age = 21;
        var name = "Rushikesh";
        var skills = new ArrayList<String>();

        skills.add("Java");
        skills.add("SQL");
        skills.add("Spring Boot");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Skills: " + skills);
    }
}

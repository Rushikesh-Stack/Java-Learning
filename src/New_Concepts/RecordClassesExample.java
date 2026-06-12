package New_Concepts;

record Student(int id, String name, String course) {
}

public class RecordClassesExample
{
    public static void main(String[] args) {
        Student s1 = new Student(1, "Rushikesh", "Computer Science");
        Student s2 = new Student(1, "Rushikesh", "Computer Science");

        System.out.println("ID: " + s1.id());
        System.out.println("Name: " + s1.name());
        System.out.println("Course: " + s1.course());

        System.out.println("\nStudent Details:");
        System.out.println(s1);

        System.out.println("\nAre both students equal?");
        System.out.println(s1.equals(s2));

        System.out.println("\nHash Codes:");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}

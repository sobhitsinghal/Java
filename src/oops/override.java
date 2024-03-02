public class Person implements Comparable<Person>
{
    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Person other)
    {
        // ADD CODE HERE
    }

    public static void main(String[] args)
    {
        Person p1 = new Person("Carlos",17);
        Person p2 = new Person("Lia",18);
        Person p3 = new Person("Asraf", 17);
        Person p4 = new Person("Lia", 17);
        Person p5 = new Person("Karla", 17);
        System.out.println(p1.compareTo(p2));
        System.out.println(p2.compareTo(p3));
        System.out.println(p3.compareTo(p1));
        System.out.println(p4.compareTo(p3));
        System.out.println(p4.compareTo(p5));
     }
}

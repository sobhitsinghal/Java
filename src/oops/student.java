class Student{
    String name;
    int age;
    int year;
    double marks;

    public Student(String name, int age, int year, double marks) {
        this.name = name;
        this.age = age;
        this.year = year;
        this.marks = marks;
    }



    @Override
    public String
    toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", year=" + year +
                ", marks=" + marks +
                '}';
    }
}
public class exercise15 {
    public static void main(String[] args) {
        Scanner input1=new Scanner(System.in);
        Student stu1=new Student("",0,0,0.0  );

        System.out.print("Enter the name of student:");
        stu1.name=input1.next();
        System.out.print("Enter the age of student:");
        stu1.age=input1.nextInt();
        System.out.print("Enter the year of student:");
        stu1.year=input1.nextInt();
        System.out.print("Enter the marks of student:");
        stu1.marks=input1.nextDouble();
        System.out.printf(stu1.toString());

        Scanner input2=new Scanner(System.in);
        Student stu2= new Student("",0,0,0.0);

        System.out.print("Enter the name of second student:");
        stu2.name=input2.next();
        System.out.print("Enter the age of second student:");
        stu2.age= input2.nextInt();
        System.out.print("Enter the year of second student:");
        stu2.year=input2.nextInt();
        System.out.print("Enter the marks of second student :");
        stu2.marks=input2.nextDouble();

        System.out.printf(stu2.toString());

    }
}

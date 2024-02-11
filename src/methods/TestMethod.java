package methods;

public class TestMethod {

    public static void main(String[] args) {

        TestMethod t =new TestMethod();
        t.ram();

        //ram();
        //new
        //create object
        SiyaRam s = new SiyaRam();
        s.printSiyaRam();

    }


    //example print jai shree ram

    public void ram()
    {
        System.out.println("Jai Shree Ram");
    }

    // when we have method in different class or package then we call the method
    // by using object

}

class SiyaRam {
    public void printSiyaRam()
    {
        System.out.println("Jai Siya Ram");
    }
}

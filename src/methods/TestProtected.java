package methods;

import testMethod.DemoPro;

public class TestProtected {

    public static void main(String[] args) {

       /* TestPro testPro=new TestPro(); // parent class object
        testPro.printPro();*/

        TestProAgain t=new TestProAgain(); /// child class object
        t.printPro();

       DemoPro demoPro =new DemoPro();
        demoPro.printPro();

    }
}
package com.star.oops;


class OverRiding {

    protected void printRam()
    {
        System.out.println("Ram");
    }
}

class OverridingTest extends OverRiding
{

    protected void printRam()
    {
        System.out.println("Jai Siya Ram");
    }

}
public class OverRidingDemo {

    public static void main(String[] args) {

        OverRiding overRiding=new OverRiding();
        overRiding.printRam(); // parent
        OverridingTest overridingTest=new OverridingTest();
        overridingTest.printRam(); // child

        OverRiding test = new OverridingTest();
        test.printRam(); // parent

    }

}

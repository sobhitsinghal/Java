package basicjava;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        int a,b;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter value");
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.print(a+ +b);
    }
}

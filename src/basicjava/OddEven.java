package basicjava;/* Odd Even Program */
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        int n;
        System.out.println("Enter any Number ");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();//28

        if (n % 2 == 0)//28%2==0
        {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
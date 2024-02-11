package basicjava;

import java.util.Scanner;

public class Natural {
    public static void main(String[] args) {

        int n;
        System.out.println("Enter no of Term ");
        Scanner r = new Scanner(System.in);
        n=r.nextInt(); //n=3

        for(int i=1; i<=n; i++)
        {
            System.out.print(i + " " );
        }
    }
}

package basicjava;

import java.util.Scanner;

public class Sum
{
    public static void main(String[] args) {

        int n,sum=0;
        System.out.print("Enter no of Term ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        for(int i=1;i<=n;i++)
        {
            sum=sum+1;

        }
        System.out.println("ADDITION " + sum);

        }
    }

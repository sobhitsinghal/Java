package forexamples;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WhileExmp {

    public static void main(String[] args) {


        //single line comment
        //multiple line comment
        // --
        /**/
        /* int a=1;
        while (a<=10)
        {
            System.out.println("a value = "+a);
            a--;
        }*/

        /* int i=2;
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

                while (i<=input)
                {
                    System.out.println(i);
                    // i=i+2;
                    i+=2;
                    }*/

        int sum=0;
        int number=1000;
        int i=1;

        while(i<=1000)
        {
            sum+=i;
            i++;
        }

        System.out.println(sum);
                }
    }
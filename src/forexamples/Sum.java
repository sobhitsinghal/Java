package forexamples;

public class Sum {

    public static void main(String[] args) {


        //wrp to find sum of natural numbers from 1 to 1000;
        int sum=0;
        int number=1000;

        for(int i = 1; i <=number ; i++)
        {
            sum+=i;
        }
        System.out.println("Sum of natural number = "+sum);

    }
}

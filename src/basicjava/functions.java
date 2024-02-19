package basicjava;

public class functions {
    public static void main(String[] args) {
        //call the function
        int  n1 = fact(4);
        System.out.println(n1);
    }

    public static int fact(int n) {
        int ans = 1;

        for (int i = 1; i <= n; i++) {
            ans = ans * 1;
        }

        //System.out.println(ans);
        return ans;
    }
}




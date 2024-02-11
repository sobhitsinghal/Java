package oops;

import java.sql.SQLOutput;

public class DataHiding {
    public static void main(String[] args) {

        Balance b=new Balance();
        int bal=b.getBal();
        System.out.println(bal);
    }


}

class  Balance {

    private int x=10000;

    public int getBal() {

        //Authorize
        //Validation
        return x;
    }
    public void setX(int X) {
        this.x = x;

    }
}
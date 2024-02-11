package methods;

public class ExampleModifiers1 {

    public void printRam()
    {
        //This method accessible anywhere
    }

    private void printSiyaRam()
    {
        //This method accessible from within class
    }
    protected void printRavan(){
        //This method accessible within package + subclass
    }
    void print() {
        //This method accessible within package
    }
}

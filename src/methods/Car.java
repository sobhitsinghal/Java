package methods;

public class Car {

    public static void main(String[] args) {

        Car car=new Car();
        car.startEngine(); //public
        car.stopEngine();
        car.accelerate();
        car.horn();
    }

    public void startEngine()
    {
        System.out.println("Engine Star...");
    }

    private void stopEngine()
    {
        System.out.println("Engine Stop...");
    }
    protected void accelerate()
    {
        System.out.println("Car running..");
    }

    void horn()
    {
        System.out.println("keee keee");
    }
}

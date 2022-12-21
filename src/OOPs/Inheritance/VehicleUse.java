package OOPs.Inheritance;

public class VehicleUse {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.print();

        Car c = new Car();
        c.color = "Black";
        c.maxSpeed=100;
        c.numDoor= 4;
    }
}

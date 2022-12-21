package OOPs.Generics;

public class Vehicle implements PrintInterface {
    int maxSpeed;
    String company;

    public Vehicle(int maxSpeed, String company) {
        super();
        this.maxSpeed=maxSpeed;
        this.company = company;
    }
    public void print(){
        System.out.println(maxSpeed + " " + company);
    }
}

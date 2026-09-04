public class Inheritance {
    public static void main(String[] args) {
    Vehicle v=new Vehicle();
    Car c=new Car();
    Bike b=new Bike();
    v.start();
    c.start1();
    b.start2();
    }
}
//simple inheritance
class Vehicle{
    void start(){
        System.out.println("Vehicle is starting");
    }
}
class Car extends Vehicle{

    void start1(){
        System.out.println("Car is starting");
    }
}
class Bike extends Vehicle{
    void start2(){
        System.out.println("Bike is starting");
    }
}
public class Abstraction {
    public static void main(String []args){
        Car c1=new FuelCar();
        c1.start();
        c1.accelerate();
        c1.brake();
        Car c2=new ElectricCar();
        c2.start();
        c2.accelerate();
        c2.brake();
    }
}
abstract class Car{
    void start(){
        System.out.println("Car is starting");
    }
    abstract void accelerate();
    abstract void brake();
}
class FuelCar extends Car{
    @Override
    void accelerate(){
        System.out.println("Fuel car is accelerating");
    }
    @Override
    void brake(){
        System.out.println("Fuel car is braking");
    }
}
class ElectricCar extends Car{
    @Override
    void accelerate(){
        System.out.println("Electric car is accelerating");
    }
    @Override
    void brake(){
        System.out.println("Electric car is braking");
    }
}

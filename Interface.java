public class Interface {
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
interface Car{
    void start();
    void accelerate();
    void brake();
}
class FuelCar implements Car{
    @Override
    public void start(){
        System.out.println("Fuel car is starting");
    }
    @Override
    public void accelerate(){
        System.out.println("Fuel car is accelerating");
    }
    @Override
    public void brake(){
        System.out.println("Fuel car is braking");
    }
}
class ElectricCar implements Car{
    @Override
    public void start(){
        System.out.println("Electric car is starting");
    }
    @Override
    public void accelerate(){
        System.out.println("Electric car is accelerating");
    }
    @Override
    public void brake(){
        System.out.println("Electric car is braking");
    }
}
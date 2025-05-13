package InheritanceTest;

public class HeavyBike extends TwoWheelVehicles{

    @Override
    public void parkingMethod() {
        System.out.println("Parking method of heavy Bike");
    }

    @Override
    public void drive() {
        System.out.println("Drive method of bike");
    }

    public void method1(){
        System.out.println("mthod 1 of heavy bike");
    }



}

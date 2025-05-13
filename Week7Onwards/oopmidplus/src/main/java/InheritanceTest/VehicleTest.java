package InheritanceTest;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v; // refernce of parent abstract class

        Vehicle v1=new Vehicle(){
            public void drive(){

            }
        };


        TwoWheelVehicles twoWheelVehicles=new TwoWheelVehicles() {
            @Override
            public void parkingMethod() {

            }

            @Override
            public void drive() {

            }
        };
        twoWheelVehicles.parkingMethod();


        v=new FourWheelVehicle();

        v.drive();
        v=new HeavyBike();
        v.drive();

        CRM crm=new CRM() {
            @Override
            public void add() {

            }

            @Override
            public void remove() {

            }

            @Override
            public void find() {

            }

            @Override
            public void update() {

            }
        };


    }
}

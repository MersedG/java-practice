package vehiclepack;

public class Car extends Vehicle{
    int doors ;
    int wheels;
    void insertCar(int doors, int wheels){
        this.doors = doors;
        this.wheels = wheels;
    }
    void displeyCar(){
        System.out.println("This Car has " +doors+ " doors and " +wheels+" wheels");
    }
}

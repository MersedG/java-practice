package vehiclepack;

public class Bike extends Vehicle{
    int pedals = 2;
    String color;

    void displeyBike(){
        System.out.println("This Bike has " +pedals+ " pedals+");
    }
    void insertBike(int pedals,String color){
        this.pedals = pedals;
        this.color = color;
    }
    void bikeDrive(){
        System.out.println("Zerina is driving the bike");
    }
    void bikeStop(){
        System.out.println("Zerina has stopped driving the bike");
    }
}

package vehiclepack;

public class Main {

    public static void main(String[] args) {
	// making object Car
        Car car = new Car();
        Bike bike = new Bike();
        car.displeyCar();
        bike.displeyBike();
        bike.go();
        car.go();
        car.stop();
        bike.stop();
        car.insertCar(4,6);
        bike.insertBike(2,"White");
        car.displeyCar();
        bike.displeyBike();
        bike.bikeDrive();
        bike.bikeStop();
    }
}

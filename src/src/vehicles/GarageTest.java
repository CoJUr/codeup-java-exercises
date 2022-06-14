package vehicles;

public class GarageTest {

    /*Create a Garage class. The Garage class should have one property, a Vehicle[] array called cars.
    Then it should have retrieveVehicles() method that loops through the cars array and makes their noises in sequence.
    Create a GarageTest class. Create three cars (more if you want) and put them in an array of vehicles.
    Instantiate a Garage, assign your array to the garage's cars property and run the retrieveVehicles method.
    Now, replace one of the cars with another type of vehicle. Run the retrieveVehicles method again.

     */

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Motorcycle();
        vehicles[0].setName("moped");
        vehicles[1] = new Train();
        vehicles[1].setName("Charles");


        Garage pimpMyRide = new Garage();
        pimpMyRide.setVehicles(vehicles);
        pimpMyRide.retrieveVehicles();
    }

}

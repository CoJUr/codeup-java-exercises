package vehicles;

public class Garage {


    //Create a Garage class. The Garage class should have one property, a Vehicle[] array called cars.
    // Then it should have retrieveVehicles() method that loops through the cars array and makes their noises in sequence.
    // Create a GarageTest class. Create three cars (more if you want) and put them in an array of vehicles.
    // Instantiate a Garage, assign your array to the garage's cars property and run the retrieveVehicles method.
    //
    //Now, replace one of the cars with another type of vehicle. Run the retrieveVehicles method again.
    private Vehicle[] vehicles;

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public void retrieveVehicles() {
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].makeNoise();
        }
    }
}

package vehicles;

public class KennethsGarage{

    public static void main(String[] args) {

        Garage kennethsGarage = new Garage("Kenneth's Garage");

        Vehicle[] garageVehicles = new Vehicle[3];
        garageVehicles[0] = new Train("Locomotive");
        garageVehicles[1] = new Motorcycle("Dirt bike");
        garageVehicles[2] = new Motorcycle("Italian");
        kennethsGarage.setVehicles(garageVehicles);
        Vehicle vehicle1 = kennethsGarage.findVehicle("Z06", kennethsGarage.getVehicles());
        System.out.println("I found the " + vehicle1.getName());
        kennethsGarage.retrieveVehicles();
    }
}

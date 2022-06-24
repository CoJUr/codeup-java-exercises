package masterclass.CompositionAndEncapsulationPolymorph;

import masterclass.Dimensions;

public class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;

    private Dimensions dimensions; //another class    width height and depth of the computer's case

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public Case(String model, String manufacturer, String powerSupply) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
    }

    public Case() {
    }

    public Case(String model, String dell, String powerSupply, masterclass.CompositionAndEncapsulationPolymorph.Dimensions dimensions) {
        this.model = model;
        this.powerSupply = powerSupply;
        dimensions = dimensions;
    }

    //power on function
    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }

    //getters

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}

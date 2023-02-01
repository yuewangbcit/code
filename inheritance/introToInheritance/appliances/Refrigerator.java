package code.inheritance.introToInheritance.appliances;

/**
 * Refrigerator.
 * 
 * @author BCIT
 * @version 2020
 */
public class Refrigerator extends Appliance {

    public static final double DEFAULT_UPPER_BOUND_FREEZER_TEMP_CELSIUS = 0.0;
    public static final double DEFAULT_LOWER_BOUND_FREEZER_TEMP_CELSIUS = -20.0;

    private double minimumTemperatureCelsius;
    private FreezerLocation freezerLocation;
    
    /**
     * Constructor for objects of type Refrigerator.
     */
    public Refrigerator() {
        super();
    }

    /**
     * Constructor for objects of type Refrigerator.
     * 
     * @param manufacturer
     * @param serialNumber
     * @param heightCentimetres
     * @param widthCentimetres
     * @param depthCentimetres
     * @param minimumTemperatureCelsius
     * @param freezerLocation
     */
    public Refrigerator(String manufacturer,
                        String serialNumber,
                        double heightCentimetres,
                        double widthCentimetres,
                        double depthCentimetres,
                        double minimumTemperatureCelsius,
                        FreezerLocation freezerLocation) {
        super(manufacturer, serialNumber, heightCentimetres, widthCentimetres, depthCentimetres);
        setMinimumTemperatureCelsius(minimumTemperatureCelsius);
        setFreezerLocation(freezerLocation);
    }

    /**
     * Returns the minimumTemperatureCelsius.
     * 
     * @return minimumTemperatureCelsius as a double
     */
    public double getMinimumTemperatureCelsius() {
        return minimumTemperatureCelsius;
    }

    /**
     * Returns the freezerLocation.
     * 
     * @return freezerLocation as a FreezerLocation
     */
    public FreezerLocation getFreezerLocation() {
        return freezerLocation;
    }

    /**
     * Sets the minimumTemperatureCelsius.
     * 
     * @param minimumTemperatureCelsius
     *            the minimumTemperatureCelsius to set
     */
    public void setMinimumTemperatureCelsius(double minimumTemperatureCelsius) {
        if (minimumTemperatureCelsius >= DEFAULT_LOWER_BOUND_FREEZER_TEMP_CELSIUS
                && minimumTemperatureCelsius <= DEFAULT_UPPER_BOUND_FREEZER_TEMP_CELSIUS) {
            this.minimumTemperatureCelsius = minimumTemperatureCelsius;
        }
    }

    /**
     * Sets the freezerLocation.
     * 
     * @param freezerLocation
     *            the freezerLocation to set
     */
    public void setFreezerLocation(FreezerLocation freezerLocation) {
        this.freezerLocation = freezerLocation;
    }

    /**
     * Prints the details.
     */
    public void printDetails() {
        System.out.println("Refrigerator [minimumTemperatureCelsius=" + minimumTemperatureCelsius + ", freezerLocation="
                + freezerLocation + ", toString()=" + super.toString() + "]");
    }

}

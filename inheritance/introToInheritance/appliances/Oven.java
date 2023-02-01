package code.inheritance.introToInheritance.appliances;

/**
 * Oven.
 * 
 * @author BCIT
 * @version 2020
 */
public class Oven extends Appliance {

    public static final int MAX_NUMBER_ELEMENTS = 16;
    public static final int MIN_NUMBER_ELEMENTS = 1;
    public static final int DEFAULT_NUMBER_ELEMENTS = 4;
    public static final double UPPER_BOUND_MAX_TEMP_CELSIUS = 500.0;
    public static final double LOWER_BOUND_MAX_TEMP_CELSIUS = 100.0;
    public static final double DEFAULT_MAX_TEMP_CELSIUS = 200.0;

    private int numberOfElements;
    private double maxTemperatureCelsius;
    
    /**
     * Constructor for objects of type Oven.
     */
    public Oven() {
        super();
    }

    /**
     * Constructor for objects of type Oven.
     * 
     * @param manufacturer
     * @param serialNumber
     * @param heightCentimetres
     * @param widthCentimetres
     * @param depthCentimetres
     * @param numberOfElements
     * @param maxTemperatureCelsius
     */
    public Oven(String manufacturer,
                String serialNumber,
                double heightCentimetres,
                double widthCentimetres,
                double depthCentimetres,
                int numberOfElements,
                double maxTemperatureCelsius) {
        super(manufacturer, serialNumber, heightCentimetres, widthCentimetres, depthCentimetres);
        setNumberOfElements(numberOfElements);
        setMaxTemperatureCelsius(maxTemperatureCelsius);
    }

    /**
     * Returns the numberOfElements.
     * 
     * @return numberOfElements as a int
     */
    public int getNumberOfElements() {
        return numberOfElements;
    }

    /**
     * Returns the maxTemperatureCelsius.
     * 
     * @return maxTemperatureCelsius as a double
     */
    public double getMaxTemperatureCelsius() {
        return maxTemperatureCelsius;
    }

    /**
     * Sets the numberOfElements.
     * 
     * @param numberOfElements
     *            the numberOfElements to set
     */
    public void setNumberOfElements(int numberOfElements) {
        if (numberOfElements >= MIN_NUMBER_ELEMENTS && numberOfElements <= MAX_NUMBER_ELEMENTS) {
            this.numberOfElements = numberOfElements;
        }

        if (this.numberOfElements == 0) {
            this.numberOfElements = DEFAULT_NUMBER_ELEMENTS;
        }
    }

    /**
     * Sets the maxTemperatureCelsius.
     * 
     * @param maxTemperatureCelsius
     *            the maxTemperatureCelsius to set
     */
    public void setMaxTemperatureCelsius(double maxTemperatureCelsius) {
        if (maxTemperatureCelsius >= LOWER_BOUND_MAX_TEMP_CELSIUS
                && maxTemperatureCelsius <= UPPER_BOUND_MAX_TEMP_CELSIUS) {
            this.maxTemperatureCelsius = maxTemperatureCelsius;
        }

        if (this.maxTemperatureCelsius == 0) {
            this.maxTemperatureCelsius = DEFAULT_MAX_TEMP_CELSIUS;
        }
    }

    /**
     * Prints the details.
     */
    public void printDetails() {
        System.out.println("Oven [numberOfElements=" + numberOfElements + ", maxTemperatureCelsius=" + maxTemperatureCelsius
                + ", toString()=" + super.toString() + "]");
    }

}

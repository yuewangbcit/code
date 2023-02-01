package code.inheritance.introToInheritance.firm;

/**
 * Represents an employee that gets paid by the hour.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class Hourly extends Employee {

    private int hoursWorked;

    /**
     * No argument constructor. For creating components to be initialized from a
     * Scanner
     */
    public Hourly() {
    }

    /**
     * Constructs a new Hourly object using the specified information.
     *
     * @param eName       employee name
     * @param eAddress    employee address
     * @param ePhone      employee phone
     * @param socInNumber social insurance number
     * @param rate        hourly pay rate
     */
    public Hourly(String eName,
                  String eAddress,
                  String ePhone,
                  String socInNumber,
                  double rate) {
        super(eName, eAddress, ePhone, socInNumber, rate);
    }

    /**
     * Adds the specified number of hours to this employee's accumulated hours.
     *
     * @param moreHours additional hours worked
     */
    public void addHours(int moreHours) {
        hoursWorked += moreHours;
    }

    /**
     * Computes and returns the pay for this hourly employee.
     *
     * @return pay for the pay period
     */
    public double pay() {
        double payment = getPayRate() * hoursWorked;

        hoursWorked = 0;

        return payment;
    }

    /**
     * Returns information about this hourly employee as a string.
     *
     * @return adds hours worked to information
     */
    public String toString() {
        String result = super.toString();

        result += "\nCurrent hours: " + hoursWorked;

        return result;
    }
}


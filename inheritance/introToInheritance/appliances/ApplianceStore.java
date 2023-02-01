package code.inheritance.introToInheritance.appliances;

/**
 * Tester.
 * 
 * @author BCIT
 * @version 2020
 */
public class ApplianceStore {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {

//        ArrayList<Appliance> listOfAppliances = new ArrayList<Appliance>();
//
//        for (int i = 0; i < 2; ++i) {
//            listOfAppliances.add(new Appliance("", "", 0, 0, 0));
//            listOfAppliances.add(new Oven("", "", 0, 0, 0, 0, 0));
//            listOfAppliances.add(new Refrigerator("", "", 0, 0, 0, 0, FreezerLocation.TOP));
//        }
//
//        for (Appliance appliance : listOfAppliances) {
//            System.out.println(appliance);
//        }
//
//        Iterator<Appliance> applianceIterator = listOfAppliances.iterator();
//        while (applianceIterator.hasNext()) {
//            System.out.println(applianceIterator.next());
//        }

        Oven amysOven = new Oven();
        System.out.println(amysOven.getManufacturer());

    }

}

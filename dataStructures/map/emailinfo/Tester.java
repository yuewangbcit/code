package code.dataStructures.map.emailinfo;

/**
 * Tester.
 *
 * @author BCIT
 * @version 2020
 */
public class Tester {

    /**
     * SomeMain methods drives the test.
     *
     * @param args
     */
    public static void main(String[] args) {
        EmailInfo myAddressBook = new EmailInfo();
        myAddressBook.addFriend("Dorota", "dot@gmail.com");
        myAddressBook.addFriend("Elzbieta", "beth@gmail.com");
        myAddressBook.addFriend("Fryderyk", "fred@gmail.com");
        myAddressBook.addFriend("Adam", "adam@gmail.com");
        myAddressBook.addFriend("Benedykt", "ben@gmail.com");
        myAddressBook.addFriend("Cyryl", "rys@gmail.com");
        System.out.println("Invoking listAll");
        myAddressBook.listAll();
        System.out.println();
        System.out.println("Invoking listSorted1");
        myAddressBook.listSorted1();
        System.out.println();
        System.out.println("Invoking getAddress");
        System.out.println(myAddressBook.getAddress("Fryderyk"));
        System.out.println();
        System.out.println("Invoking findFriends");
        myAddressBook.findFriends("fred@gmail.com");
        System.out.println();
        System.out.println("Invoking removeFriend");
        myAddressBook.removeFriend("francine");
        System.out.println();
        System.out.println("Invoking findFriends");
        myAddressBook.findFriends("francine@gmail.com");
        System.out.println();
        System.out.println("Invoking listAll");
        myAddressBook.listAll();
        System.out.println();
        System.out.println("Invoking listSorted1");
        myAddressBook.listSorted1();
    }
}

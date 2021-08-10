import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Uc5 {
    private String FirstName;
    private String LastName;
    private String Address;
    private int Zip;
    private String City;
    private String State;
    private long PhoneNumber;
    private String Email;
    private HashMap contact;

    public Uc5(String FirstName, String LastName, String Address, String City, int Zip,String State, long PhoneNumber, String Email) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.Zip = Zip;
        this.City = City;
        this.State = State;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
    }

    public Uc5() {
    }

    private static void getContact(AddressBook details) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter you first name");
        details.FirstName = obj.next();
        System.out.println("Enter you last name");
        details.LastName = obj.next();
        obj.nextLine();
        System.out.println("Enter you Address name");
        details.Address = obj.nextLine();
        System.out.println("Enter you zip ");
        details.Zip = obj.nextInt();
        System.out.println("Enter you city name");
        details.City = obj.next();
        System.out.println("Enter you state name");
        details.State = obj.next();
        obj.nextLine();
        System.out.println("Enter you phone number");
        details.PhoneNumber = obj.nextLong();
        obj.nextLine();
        System.out.println("Enter you email name");
        details.Email = obj.nextLine();
    }

    public static void editContact(HashMap contact) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter your name");
        String name = obj.next();
        ArrayList option = (ArrayList) (contact.get(name));
        boolean conditon = true;
        while (conditon) {
            System.out.println("enter number to edit 1.FirstName\n2.LastName\n3.Address\n4.Zip\n5.City\n6.State\n7.Phonenumber\n8.E-mail\n9.Quit");
            int check = obj.nextInt();
            switch (check) {
                case 1:
                    System.out.println("Enter you first name");
                    option.set(1, obj.next());
                    break;
                case 2:
                    System.out.println("Enter you last name");
                    option.set(2, obj.next());
                    obj.nextLine();
                    break;
                case 3:
                    System.out.println("Enter you Address name");
                    option.set(3, obj.nextLine());
                    break;
                case 4:
                    System.out.println("Enter you zip ");
                    option.set(4, obj.nextInt());
                    break;
                case 5:
                    System.out.println("Enter you city name");
                    option.set(5, obj.next());
                    break;
                case 6:
                    System.out.println("Enter you state name");
                    option.set(6, obj.next());
                    obj.nextLine();
                    break;
                case 7:
                    System.out.println("Enter you phone number");
                    option.set(7, obj.nextLong());
                    obj.nextLine();
                    break;
                case 8:
                    System.out.println("Enter you email name");
                    option.set(8, obj.next());
                    break;
                case 9:
                    conditon = false;
                    break;
                default:
                    System.out.println("invalid input");
            }
            if (name != (contact.get(name))) {
                Object newname = option.get(0);
                contact.remove(name);
                contact.put(newname, option);
            }
        }
    }

    public HashMap storeContact(HashMap contact) {
        ArrayList<String> entry = new ArrayList<String>();
        entry.add(FirstName);
        entry.add(LastName);
        entry.add(Address);
        entry.add(String.valueOf(Zip));
        entry.add(City);
        entry.add(State);
        entry.add(String.valueOf(PhoneNumber));
        entry.add(Email);
        contact.put(FirstName, entry);
        System.out.println(entry);
        System.out.println(contact);
        return contact;
    }

    @Override
    public String toString() {
        return FirstName;
    }

    public static boolean makechoice(AddressBook contact1, HashMap contact) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your option\n1.Add contact\n2.Display Contacts\n3.edit\n4.Delete\n5.Quit");
        int check = obj.nextInt();
        boolean conditon = true;
        switch (check) {
            case 1:
                getContact(contact1);
                HashMap<String, ArrayList<String>> data = contact1.storeContact(contact);
                contact = data;
                break;
            case 2:
                displayStore(contact);
                break;
            case 3:
                editContact(contact);
                break;
            case 4:
                deleteEntry(contact);
                break;
            case 0:
                conditon = false;
                break;
            default:
                System.out.println("invalid input");
        }
        return conditon;
    }

    public static void displayStore(HashMap contact) {
        System.out.println(contact);
    }

    public static void deleteEntry(HashMap contact){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter your name to delete from contact");
        String name = obj.next();
        contact.remove(name);
    }
    public static void main(String[] args) {
        Uc5 details = new Uc5();
        HashMap<String, ArrayList<String>> contact = new HashMap<String, ArrayList<String>>();
        boolean conditon = true;
        while (conditon) {
            boolean condition = makechoice(details, contact);
            if (condition == false)
                break;
        }
    }
}


import java.util.Scanner;

public class Uc4 {

    static Scanner input = new Scanner(System.in);
    static String[] details;

    public static String[] Person() {
        String[] contact = new String[8];
        System.out.println("Enter your details accordingly \n1. First Name\n2. Last Name\n3. Address \n4. Zipcode \n5. City \n6. State\n7. Phone number\n8. E-mail");
        for (int index = 0; index < contact.length; index++)
            contact[index] = input.next();
        return contact;
    }

    public static String[] edit(String[] contact) {
        System.out.println("Press the option that you want to edit\n1.First Name\n2.Last Name\n3.Address\n4.Zip code\n5.City\n6.State\n7.phone number\n8.E-mail");
        int choose = input.nextInt();
        if (choose >= 1 && choose <= 8) {
            choose--;
            System.out.println("Enter the new details you want to edit");
            contact[choose] = input.next();
        }
        System.out.println("New details are updated sucessufully...");
        for (int index = 0; index < details.length; index++) {
            System.out.println(details[index]);
        }
        return contact;
    }

    public static String[] delete(String[] contact) {
        System.out.print("Enter the first name of the contact that you want to delete :");
        String personName = input.next();
        if (contact[0].equals(personName)) {
            for (int index = 0; index < contact.length; index++)
                contact[index] = null;
            System.out.println(personName+" Contact details delete sucessfully");
        } else {
            System.out.println("Contact name not available");
        }

        return contact;
    }

    public static void option() {
        boolean bool = true;
        while (bool) {
            System.out.println("Chosse the either of one option for further action");
            System.out.println("1. Edit \n2. Delete\nChoose anyNumber for Exit");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    details = edit(details);
                    break;
                case 2:
                    details = delete(details);
                    break;
                default:
                    bool = false;
                    break;
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book System....");
        details = Person();
        option();
    }
}
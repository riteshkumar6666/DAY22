import java.util.Scanner;

public class Uc3 {

    public String FirstName;
    public String LastName;
    public String Address;
    public int Zip;
    public String City;
    public String State;
    public int PhoneNumber;
    public String Email;

    public Uc3(String FirstName, String LastName, String Address, String City, int Zip, String State,int PhoneNumber, String Email) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.Zip = Zip;
        this.City = City;
        this.State = State;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
    }

    public Uc3() {}

    Scanner input = new Scanner(System.in);

    public String[] details() {

        String[] contact = new String[8];
        System.out.println("Enter your First Name");
        String Firstname = input.nextLine();
        contact[0] = Firstname;
        System.out.println("Enter your Last Name");
        String LastName = input.nextLine();
        contact[1] = LastName;
        System.out.println("Enter your Address");
        String Address = input.nextLine();
        contact[2] = Address;
        System.out.println("Enter your Zip code");
        String Zip = input.next();
        contact[3] = Zip;
        System.out.println("Enter your City name");
        String City = input.next();
        contact[4] = City;
        System.out.println("Enter your State name");
        String State = input.next();
        contact[5] = State;
        System.out.println("Enter your Phone number");
        String PhoneNumber = input.next();
        contact[6] = PhoneNumber;
        System.out.println("Enter your e-mail address");
        String Email = input.next();
        contact[7] = Email;
        return contact;
    }

    Scanner sc = new Scanner(System.in);

    public void edit(String[] contact) {
        System.out.println("If you want to edit then press 1 else press 0");

        int read = sc.nextInt();
        if (read == 1) {
            System.out.println(
                    "Press the respective number you want to edit\n1  First Name\n2 Last Name\n3 Address\n4 Zip code\n5 City\n6 state\n7 phone number\n8 email");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Enter your new First Name");
                    String newFirstName = sc.next();
                    contact[0] = newFirstName;
                    break;
                case 2:
                    System.out.println("Enter your new Last Name");
                    String newLastName = sc.next();
                    contact[1] = newLastName;
                    break;
                case 3:
                    System.out.println("Enter your new Address");
                    String newAddress = sc.next();
                    contact[2] = newAddress;
                    break;
                case 4:
                    System.out.println("Enter your new Zip code");
                    String newZip = sc.next();
                    contact[3] = newZip;
                    break;
                case 5:
                    System.out.println("Enter your new city name");
                    String newCity = sc.next();
                    contact[4] = newCity;
                    break;
                case 6:
                    System.out.println("Enter your new State name");
                    String newState = sc.next();
                    contact[5] = newState;
                    break;
                case 7:
                    System.out.println("Enter your new Phone number");
                    String newPhoneNumber = sc.next();
                    contact[6] = newPhoneNumber;
                    break;
                case 8:
                    System.out.println("Enter your new email");
                    String newEmail = sc.next();
                    contact[7] = newEmail;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            System.out.println("Your new details are as follows");
            for (int j = 0; j < contact.length; j++) {
                System.out.println(contact[j]);
            }
        } else if (read == 0) {
            for (int j = 0; j < contact.length; j++) {
                System.out.println(contact[j]);
            }

        } else
            System.out.println("Invalid Input");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book");
        Uc3 contacts = new Uc3();
        String[] info = contacts.details();
        contacts.edit(info);
    }
}

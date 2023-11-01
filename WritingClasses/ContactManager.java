import java.util.Scanner;

/**
 * Creates and interacts with a ContactList for demo purposes.
 * 
 * @author mvail
 */
public class ContactManager {
    public static void main(String[] args) {

        final String MENU = "Contact Manager\n"
                + "(L)oad a new list\n"
                + "(P)rint list\n"
                + "(A)dd a new contact\n";

        Scanner kbd = new Scanner(System.in);
        ContactList list = null;
        String choice = "M";

        while (!choice.equals("Q")) {
            switch (choice) {
                case "M":
                    System.out.println(MENU);
                    break;
                case "L":
                    System.out.print("Enter list filename: ");
                    list = new ContactList(kbd.nextLine().trim());
                    break;
                case "P":
                    if (list == null) {
                        System.out.println("No list is loaded.");
                    } else {
                        System.out.println(list.toString());
                    }
                    break;
                case "A":
                    System.out.print("Enter first name: ");
                    String firstName = kbd.nextLine().trim();
                    System.out.print("Enter last name: ");
                    String lastName = kbd.nextLine().trim();
                    System.out.println("Enter email: ");
                    String email = kbd.nextLine().trim();
                    System.out.print("Enter phone number: ");
                    String phone = kbd.nextLine().trim();
                    list.addContact(lastName, firstName, email, phone);
                    break;
                case "Q":
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            if (!choice.toUpperCase().equals("Q")) {
                System.out.print("Enter choice (M for menu): ");
                choice = kbd.nextLine().toUpperCase().trim();
            }
        }

        kbd.close();
    }
}

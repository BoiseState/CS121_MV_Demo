/**
 * Represents a contact with first and last name,
 * email address, and phone number.
 * @author mvail
 */
public class Contact {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    /** 
     * Initialize a Contact with the given values.
     * @param firstName
     * @param lastName
     * @param email
     * @param phoneNumber
     */
    public Contact(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + ", Email: " + email + ", Phone: " + phoneNumber;
    }

    /** Return Contact's first name */
    public String getFirstName() {
        return firstName;
    }

    /** Update Contact's first name */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /** Return Contact's last name */
    public String getLastName() {
        return lastName;
    }

    /** Update Contact's last name */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /** Return Contact's email address */
    public String getEmail() {
        return email;
    }

    /** Update Contact's email address */
    public void setEmail(String email) {
        this.email = email;
    }

    /** Return Contact's phone number */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /** Update Contact's phone number */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

package Task_01;

public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;


    public Customer(String firstName, String tmpLastName, String username) {
        this.firstName = firstName;
        lastName = tmpLastName;
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    /*private void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    */

    public String getLastName() {
        return lastName;
    }

    /*private void setLastName(String lastName) {
        this.lastName = lastName;
    }
    */
    public String getUsername() {
        return username;
    }

    /*private void setUsername(String username) {
        this.username = username;
    }
    */
    public String toString() {
        return "First name: " + firstName + " last name: " + lastName + " and username: " + username;
    }


}

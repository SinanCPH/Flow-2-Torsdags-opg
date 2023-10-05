package Task_01;

import java.util.ArrayList;

//Files og...
public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> arrCustomers = new ArrayList<>();
        arrCustomers.add(new Customer("Sinan", "Faisal", "0s3rn1m3"));
        arrCustomers.add(new Customer("Winner", "Loser", "I am both a winner and a loser"));
        arrCustomers.add(new Customer("Mor", "Far", "morfar"));
        printCustomer(arrCustomers);

    }
    public static void printCustomer(ArrayList<Customer> customers){
        for(Customer customer : customers){
            System.out.println(customer);
        }
    }
}
package Part2.Exercise9;

public class Customer {
    private String firstName;
    private String lastName;
    private float deposit;

    public Customer(String firstName, String lastName, float deposit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.deposit = deposit;
    }

    public static void main(String[] args) {
        Customer customer = new Customer("Agent", "Smith", 1408);
        System.out.println(customer);
    }
}

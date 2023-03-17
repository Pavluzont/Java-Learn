package Part3;

public class Person {
    public String firstName;
    public String lastName;

    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Smith");
        System.out.println(person.firstName + " " + person.lastName);
    }
}

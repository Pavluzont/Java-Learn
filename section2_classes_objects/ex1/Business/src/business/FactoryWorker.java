package business;

class FactoryWorker {
    private String firstName;
    private int age;

    public FactoryWorker(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public char getFirstNameInitial() {
        return firstName.charAt(1);
    }
}

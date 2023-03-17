package Part2.Exercise1.business;

public class Company {
    FactoryWorker worker;

    public static void main(String[] args) {
        FactoryWorker worker = new FactoryWorker("Oliver", 3);
        worker.sayHello();
        char initial = worker.getFirstNameInitial();
        System.out.println(initial);
    }
}

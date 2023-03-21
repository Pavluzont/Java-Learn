package Part5;

import java.util.Random;

public class Exercise5 {
    private int sum = 0;

    public int next() {
        this.sum += new Random().nextInt(10);
        return this.sum;
    }

    public static void main(String[] args) {
        Exercise5 example = new Exercise5();
        System.out.println(example.next());
        System.out.println(example.next());
        System.out.println(example.next());
        System.out.println(example.next());
        System.out.println(example.next());
        System.out.println(example.next());
        System.out.println(example.next());
        System.out.println(example.next());
        System.out.println(example.next());
        System.out.println(example.next());
    }
}

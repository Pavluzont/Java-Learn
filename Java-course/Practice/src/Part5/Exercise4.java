package Part5;

public class Exercise4 {
    private int[] numbers = {16, 35, 60, 110, 135, 161, 240, 255, 333, 351};
    private int count = 0;

    public int next() {
        int category = numbers[count] / 90;
        count = count + 1;
        return category;
    }

    public static void main(String[] args) {
        Exercise4 example = new Exercise4();
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
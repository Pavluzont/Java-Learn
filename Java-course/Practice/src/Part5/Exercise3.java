package Part5;

public class Exercise3 {
    private String[] names = {"dima", "ivan", "elshan", "polina", "angelina", "yulia", "anzhela", "andrey", "liza", "svyatoslav"};
    private int count = 0;
    public String next() {
        String person = names[count].substring(0,1).toUpperCase() + names[count].substring(1);
        count = count + 1;
        return person;
    }
    public static void main(String[] args) {
        Exercise3 example = new Exercise3();
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

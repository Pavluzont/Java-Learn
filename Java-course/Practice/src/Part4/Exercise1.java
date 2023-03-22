package Part4;

public class Exercise1 {
    public static void main(String[] args) {
        String regex = "[DbL]ark";
        System.out.println("Dark".matches(regex));
        System.out.println("bark".matches(regex));
        System.out.println("Lark".matches(regex));

        String regex2 = "(St|[DbL])ark";
        System.out.println("Stark".matches(regex2));
        System.out.println("Dark".matches(regex2));
        System.out.println("bark".matches(regex2));
        System.out.println("Lark".matches(regex2));
    }
}

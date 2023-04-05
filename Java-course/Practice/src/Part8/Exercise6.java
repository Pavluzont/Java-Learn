package Part8;

public class Exercise6 {
    public static void main(String[] args) {
        System.out.println(convert(8));
        System.out.println(convert(7));
        System.out.println(convert(6));
        System.out.println(convert(5));
        System.out.println(convert(4));
        System.out.println(convert(3));
    }

    private static int convert(int num) {
        return 8 - num;
    }
}

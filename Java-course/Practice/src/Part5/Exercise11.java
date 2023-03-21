package Part5;

public class Exercise11 {
    public static int getNumbersSum(String number1, String number2) {
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);

        return num1+num2;
    }

    public static void main(String[] args) {
        System.out.println(getNumbersSum("37", "13"));
    }
}

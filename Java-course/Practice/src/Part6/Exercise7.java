package Part6;

public class Exercise7 {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int count = 0;

        for (String day : days) {
            count += day.length();
        }
        System.out.println(count);
    }
}

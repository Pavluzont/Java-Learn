package Part6;

public class Exercise3 {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int day = 0;

        do {
            System.out.println(days[day++]);
        } while (day < days.length);

        day = 0;

        do {
            if (day % 2 == 0) {
                System.out.println(days[day++]);
            } else {
                System.out.println(days[day++].toUpperCase());
            }
        } while (day < days.length);

        day = 0;

        do {
            String result = day % 2 == 0 ? days[day++] : days[day++].toUpperCase();
            System.out.println(result);
        } while (day < days.length);
    }
}

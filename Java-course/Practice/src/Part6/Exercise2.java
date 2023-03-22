package Part6;

public class Exercise2 {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int day = 0;

        while (day < days.length) {
            System.out.println(days[day++]);
        }

        day = 0;

        while (day < days.length) {
            if (day % 2 == 0) {
                System.out.println(days[day++]);
            } else {
                System.out.println(days[day++].toUpperCase());
            }
        }

        day = 0;

        while(day < days.length) {
            String result = day % 2 == 0 ? days[day++] : days[day++].toUpperCase();
            System.out.println(result);
        }
    }
}

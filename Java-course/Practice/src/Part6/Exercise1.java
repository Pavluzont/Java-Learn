package Part6;

public class Exercise1 {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (String day : days) {
            System.out.println(day);
        }

        int day;

        for (day = 0; day < days.length; day++) {
            System.out.println(days[day]);
        }

        for (day = 0; day < days.length; day++) {
            if (day % 2 == 0) {
                System.out.println(days[day]);
            } else {
                System.out.println(days[day].toUpperCase());
            }
        }

        for (day = 0; day < days.length; day++) {
            String result = (day % 2 == 0) ? days[day] : days[day].toUpperCase();
            System.out.println(result);
        }
    }
}

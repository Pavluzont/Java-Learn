package Part6;

public class Exercise4 {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (String day : days) {
            if (day.equals("Sunday")) {
                System.out.println("We eat pot roast on Sunday");
            } else if (day.equals("Monday")) {
                System.out.println("We eat spaghetti on Monday");
            } else if (day.equals("Tuesday")) {
                System.out.println("We eat tacos on Tuesday");
            } else if (day.equals("Wednesday")) {
                System.out.println("We eat chicken on Wednesday");
            } else if (day.equals("Thursday")) {
                System.out.println("We eat meatloaf on Thursday");
            } else if (day.equals("Friday")) {
                System.out.println("We eat hamburgers on Friday");
            } else {
                System.out.println("We eat pizza on Saturday");
            }
        }
    }
}

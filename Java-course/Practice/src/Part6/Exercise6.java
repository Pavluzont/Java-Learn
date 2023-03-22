package Part6;

public class Exercise6 {
    private static String capitalizeWord(String word) {
        return word.substring(0,1).toUpperCase().concat(word.substring(1));
    }

    private static String capitalizeMultiWord(String multiWords) {
        String[] words = multiWords.split(" ");

        StringBuilder subString = new StringBuilder(multiWords.length() + 1);

        for (String word : words) {
            subString.append(capitalizeWord(word)).append(" ");
        }

        return subString.toString().strip();
    }
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (String day : days) {
            String meal = switch (day) {
                case "Sunday" -> "pot roast";
                case "Monday" -> "spaghetti";
                case "Tuesday" -> "tacos";
                case "Wednesday" -> "chicken";
                case "Thursday" -> "meatloaf";
                case "Friday" -> "hamburgers";
                default -> "pizza";
            };
            System.out.printf("We eat %s on %s%n", meal, day);
            System.out.printf("We eat %s on %s%n", capitalizeWord(meal), day);
            System.out.printf("We eat %s on %s%n", capitalizeMultiWord(meal), day);
        }
    }
}

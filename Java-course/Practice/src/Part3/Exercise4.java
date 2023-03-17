package Part3;

public class Exercise4 {
    public static void main(String[] args) {
        String inputText = "   alphabet ";
        String fixedtext = inputText.strip();
        String firstPart = fixedtext.substring(0, fixedtext.length() - 1);
        String secondPart = fixedtext.substring(fixedtext.length() - 1).toUpperCase();
        System.out.println(firstPart.concat(secondPart));
    }
}

package Part7;

public class Exercise1 {
    public static String makeCaps(String word) {
        StringBuilder subString = new StringBuilder(word.length());

        for (int wordIndex = 0; wordIndex < word.length(); wordIndex++) {
            String currentLetter = word.substring(wordIndex, wordIndex + 1);

            if (wordIndex % 2 == 0) {
                subString.append(currentLetter);
            } else {
                subString.append(currentLetter.toUpperCase());
            }
        }
        return subString.toString();
    }

    public static void main(String[] args) {
        Exercise1 example = new Exercise1();
        System.out.println(example.makeCaps("corgi"));
    }
}

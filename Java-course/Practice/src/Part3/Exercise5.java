package Part3;

public class Exercise5 {
    public static String findBuilding(String sentence) {
        return sentence.split(" ")[0];
    }
    public static String findStreet(String sentence) {
        int firstIndex = sentence.indexOf(" ");
        int secondIndex = sentence.indexOf(",");
        return sentence.substring(firstIndex + 1, secondIndex);
    }

    public static String findCity(String sentence) {

        return sentence.split(",")[1].strip();
    }

    public static String findState(String sentence) {

        return sentence.split(",")[2].strip().split(" ")[0];
    }

    public static String findPostalCode(String sentence) {

        return sentence.split(",")[2].strip().split(" ")[1];
    }
    public static void main(String[] args) {
        String sentence = "12345 Big St., Alphabet City, CA 90210";
        String emptySpace = " ";
        String buildingNumber = findBuilding(sentence);
        String buildingSentence = "The building number:";
        String street = findStreet(sentence);
        String streetSentence = "The Street:";
        String city = findCity(sentence);
        String citySentence = "City:";
        String state = findState(sentence);
        String stateSentence = "State:";
        String postalCode = findPostalCode(sentence);
        String postalCodeSentence = "Postal Code:";
        System.out.println(sentence);
        System.out.println(buildingSentence.concat(emptySpace.concat(buildingNumber)));
        System.out.println(streetSentence.concat(emptySpace.concat(street)));
        System.out.println(citySentence.concat(emptySpace.concat(city)));
        System.out.println(stateSentence.concat(emptySpace.concat(state)));
        System.out.println(postalCodeSentence.concat(emptySpace.concat(postalCode)));
    }
}

package Part3;

public class Exercise2 {
    public String sentence = "I like to play with my corgi cat. Corgi cats are very funny!";

    public static void main(String[] args) {
        Exercise2 exercise = new Exercise2();
        System.out.println(exercise.sentence.replace("cat", "dog"));
    }
}

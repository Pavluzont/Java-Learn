package Part2.Exercise11;

public class People {
    public static String[] friends = {"Oliver", "Vita", "Paco"};

    public static String[] getFriends() {
        return People.friends;
    }

    public static void main(String[] args) {
        People people = new People();

        System.out.println(people.getFriends()[0]);
        System.out.println(people.getFriends()[1]);
        System.out.println(people.getFriends()[2]);
    }
}

package Part8;

public enum DayOfWeek {
    SUNDAY("pot roast"),
    MONDAY("spaghetti"),
    TUESDAY("tacos"),
    WEDNESDAY("chicken"),
    THURSDAY("meatloaf"),
    FRIDAY("hamburgers"),
    SATURDAY("pizza");

    private String meal;

    DayOfWeek(String meal) {
        this.meal = meal;
    }

    public String getMeal() {
        return meal;
    }
}

package Part5;

public class MathStuff {
    /**
     *This method calculates the area of a circle
     * it uses a formula: area = PI * radius^2
     * @param radius
     * @return
     */
    public static double calcAreaOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    private static double calcPathVelocity(double radius, double period) {
        return (2 * Math.PI * radius) / period;
    }

    private static double calcCentripetalAcceleration(double pathVelocity, double radius) {
        return Math.pow(pathVelocity, 2) / radius;
    }

    public static double calcCentripetalForce(double mass, double radius, double period) {
        double pathVelocity = calcPathVelocity(radius ,period);
        double acceleration = calcCentripetalAcceleration(pathVelocity, radius);
        return mass * acceleration;
    }
    public static void main(String[] args) {
        System.out.println(calcAreaOfCircle(3));
        System.out.println(calcCentripetalForce(0.2,0.8, 3));
    }
}

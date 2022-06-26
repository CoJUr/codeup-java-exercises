package shapes;

public class Circle {

    private double radius;
    private static int totalCircles;

    public Circle(double radius){
        this();
        this.radius = radius;
    }

    public Circle() {

        totalCircles++;
    }

    public double getArea() {
        return Math.PI * (this.radius*this.radius);
    }

    public double getCircumference() {
        return 2 * (Math.PI * this.radius);
    }

    public static int getTotalCircles() {

        return totalCircles;
    }

    public static void setTotalCircles(int totalCircles) {
        Circle.totalCircles = totalCircles;
    }

}

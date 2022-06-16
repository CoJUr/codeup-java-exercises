package shapes;

public class Rectangle {
    protected int length;
    protected int width;


    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {}

    public double getArea(int i) {
        System.out.print("Rectangle.getAREA ran: ");

        return length * width;
    }

    public double getPerimeter(int i) {
        System.out.print("Rectangle.getPerimeter: ");
        return 2 * (length + width);
    }




}

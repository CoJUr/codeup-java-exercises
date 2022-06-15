package shapes;

public class Square extends Rectangle{



//    public Square(int length, int width, int side) {
//        super(length, width);
//        this.side = side;
//    }

    public Square(int side) {
        super( side, side );

        System.out.print("Creating via Square(int side)\n");

    }

    public Square() {}


    public double getArea(int side) {
        System.out.print("Running Square.getArea :");
        return side * side;


    }


    public double getPerimeter(int side) {
        System.out.print("Running Square.getPerimeter ");
        return 4 * side;
    }


}
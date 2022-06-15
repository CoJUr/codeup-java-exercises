package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle();
        box1.length = 5;
        box1.width = 4;

        System.out.println(box1.getPerimeter(5));

        System.out.println(box1.getArea(5));

        Rectangle box2;
        box2 = new Square(5);

//        System.out.println(box2.getArea(5));
        System.out.println(box2.getPerimeter(6));


        System.out.println(box2.getArea(6));

    }

}

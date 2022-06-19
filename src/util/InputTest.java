package util;

public class InputTest {

    public static void main(String[] args) {

        Input input1 = new Input();
        System.out.println(input1.yesNo());
//        System.out.println(input1.getInt(0, 10));
//        System.out.println(input1.getDouble());
//        System.out.println(input1.getDouble(0.0, 10.0));

        input1.getDouble("Boo!");
    }
}

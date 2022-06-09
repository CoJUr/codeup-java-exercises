public class MethodExercises {

    public static void main(String[] args) {

        System.out.println(doAddition(4, 5));

        System.out.println(doSubtraction(5, 5));

        System.out.println(doDivision(10, 2));

        System.out.println(doMultiplication(3, 3));

        System.out.println(findRemainder(4, 2));

    }

    public static int doAddition(int x, int y) {

        return x + y;
    }

    public static int doSubtraction(int x, int y) {

        return x - y;

    }

    public static int doMultiplication(int x, int y) {

        return x * y;

    }

    public static int doDivision(int x, int y) {

        return x / y;

    }

    public static int findRemainder(int x, int y) {

        return x % y;

    }
}

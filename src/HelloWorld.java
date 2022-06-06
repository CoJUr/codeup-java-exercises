public class HelloWorld {
    public static void main(String[] args) { //main method. will have an array of string args
        System.out.println("Hello World!");

        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

//        String myString = 3.14159;
//        System.out.println(myString);

        float myNumber = 3.14F;  //fix by adding an F
        System.out.println(myNumber);


//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        int class;
        String theNumberThree = "three";
        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three";

//        int x = 4;
//        x += 5;

//        int x = 3;
//        int y = 4;
//        y *= x;

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;

        int max = Integer.MAX_VALUE;
        System.out.println(max);
        System.out.println(max++);
        System.out.println(max);
    }
}

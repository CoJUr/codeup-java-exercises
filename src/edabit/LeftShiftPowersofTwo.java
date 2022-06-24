package edabit;

public class LeftShiftPowersofTwo {

    //sample cals using << operator:
//    10 << 3 = 10* 2^3   = 10 * 8   =80
//    -32 << 2  =  -32 * 2^2   =  -32 * 4  = -128


    public static int shiftToLeft(int x, int y) {
        //write a function to mimic the left shift operator and return result from int x & y
//        int multiplier = (int) Math.pow(2, y);
//
//        return  x * multiplier;
        //mine^


        //1
//        return (int) (x * Math.pow(2, y));


        //2
        while (y-- > 0) x *= 2;


    }

    public static void main(String[] args) {


        System.out.println(shiftToLeft(2, 5));
    }

}

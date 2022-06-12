package masterclass;

public class OperatorCh {

    public static double addNums(double num, double num2) {
        return (num + num2);
    }

    public static void main(String[] args) {
        double twenty = 20.00d;
        double eighty = 80.00d;
        double myValuesTotal = (twenty + eighty) * 100d;   //need parens around 20 and 80
        double theRemainder = myValuesTotal % 40.00d;

        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some Remainder");
        }


        double step4 = (100d * addNums(twenty, eighty)) % 40.00d;

        boolean isZero = step4 == 0;

        if (isZero == false) {
            System.out.println("Got some remainder");
        } else {
            System.out.println("YES No remainder");
        }

//        System.out.println(isZero);


//        System.out.println(step4);

//        System.out.println(100 * addNums(twenty, eighty));


    }
}

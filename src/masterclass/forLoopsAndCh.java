package masterclass;

public class forLoopsAndCh {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 5.0));

//        double j;
        for (int i = 8; i > 1; i--) {
//            j = (double) i;
//            System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, i));
//            System.out.println("10k at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i))); //limits to 2 decimal places
            System.out.println(calculateInterest(10000, i));
        }

        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Found a prime! Its: " + i);
                if(count == 6) {
                    System.out.println("That's a wrap.");
                    break;
                }
            }
        }

    }



    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }


        //optimization:  for (int i = 2; i <= (long) Math.sqrt(n); i++) {        -takes fewer loops to find primes
                        for (int i = 2; i <= n/2; i++) {
                            if (n % i == 0) {
                                return false;
                            }
                        }
                        return true;
    }




    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
